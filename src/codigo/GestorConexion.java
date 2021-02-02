/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rioja
 */
public class GestorConexion {

    Connection conn1 = null;

    public int iniciarConexion() {

        String urlBBDD = "jdbc:mysql://localhost:3306/discograficaluisrioja?serverTimezone=UTC";
        String user = "root";
        String password = "1234";

        int aux = -1;

        try {
            conn1 = DriverManager.getConnection(urlBBDD, user, password);

            if (conn1 != null) {
                return 0;

            }

        } catch (SQLException ex) {
            aux = -1;
        }
        return aux;
    }

    public int cerrarConexion() {

        int aux = -1;

        try {
            conn1.close();
            return 0;
        } catch (SQLException ex) {
            aux = -1;
        }
        return aux;
    }

    public void aniadirColumna() {

        Statement sta;

        try {
            sta = conn1.createStatement();
            sta.executeUpdate("ALTER TABLE album ADD fecha_publicacion YEAR;");
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al introducir la consulta añadir columna fecha");
        }

    }

    public void borrarColumna() {

        Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("ALTER TABLE album DROP fecha_publicacion;");
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al eliminar la columna fecha");

        }

    }

    public void insertarAlbum(String cancion, String autor) {

        Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO album (titulo, autor) VALUES (" + "'" + cancion + "'" + ", " + "'" + autor + "'" + ");");
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar los datos");

        }

    }

    public void consultaTodo() {

        Statement sta;

        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM album autor;";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                System.out.println("Autor: " + rs.getString("autor"));
            }

            rs.close();
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al consultar los datos");

        }

    }

    public void consultaAutores(String titulo) {

        Statement sta;

        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM album WHERE titulo = '" + titulo + "';";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                System.out.println("\n Autor: " + rs.getString("autor") + "\n Titulo: " + rs.getString("titulo"));

            }

            rs.close();
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al consultar los datos");

        }

    }

    public String consulta_PreparedStatement(String autor) {

        String salidaConsulta = ""; 
        String query = "SELECT * FROM album WHERE autor = ?;";

        try {

            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, autor);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------" +"\n Autor: " + rs.getString("autor") + "\n Titulo: " + rs.getString("titulo") + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    public void insertarConCommit() {

        
        
        Statement sta;

        try {
            
            conn1.setAutoCommit(false);
            
            sta = conn1.createStatement();
            
            sta.executeUpdate("INSERT INTO album (titulo, autor) VALUES ('Outro Chill', 'Hora de aventuras');");
            sta.executeUpdate("INSERT INTO album (titulo, autor) VALUES ('Outro Chill II', 'Adventure Time');");
            
            sta.close();
            
            conn1.commit();
        } catch (SQLException ex) {
            
            
            
            if(conn1!=null){
                try {
                    conn1.rollback();
                } catch (SQLException ex1) {
                    System.out.println("Error al insertar los datos");
                }
            
            }

        }

    }

}
