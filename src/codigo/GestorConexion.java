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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rioja
 */
public class GestorConexion {

    Connection conn1 = null;

    //Aqui se inicia la conexion.
    public int iniciarConexion() {

        String urlBBDD = "jdbc:mysql://localhost:3306/ordenadoresluisrioja?serverTimezone=UTC";
        String user = "root";
        String password = "";

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

    //Con este metodo se cierra la conexion.
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
   

    //Con este metodo insertaremos nuevos datos en la tabla Componentes.
    public void insertarComponentes(String procesador, String disipador, String placa_base, String tarjeta_grafica, String torre, int marcas_componentes) {

        Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO componentes (procesador, disipador, placa_base, tarjeta_grafica, torre, marcas_componentes) VALUES"
            +"('" + procesador + "', '" + disipador + "', '" + placa_base + "', '" + tarjeta_grafica + "', '" + torre + "', '" + marcas_componentes + "');");
            
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar los datos");

        }

    }
    
    //Con este metodo insertaremos nuevos datos en la tabla Canciones.
    public void insertarCancion(String cancion, String autor, String duracion) {

        Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO canciones (titulo, autor, duracion) VALUES (" + "'" + cancion + "'" + ", " + "'" + autor + "'" + ", " + "'" + duracion + "'" + ");");
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar los datos");

        }

    }

    //Con este metodo consultaremos los albumes.
    public String consultaAlbumes() {

        Statement sta;
        String salidaAlbumes = "";
        String request = "";
        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM album;";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                request = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Numero de canciones: "
                        + rs.getString("numero_canciones")
                        + "\n -----------------------------------");
                salidaAlbumes = salidaAlbumes + request;
                
            }

            rs.close();
            sta.close();
            return salidaAlbumes;
            
        } catch (SQLException ex) {
           return ex.toString();

        }

    }
    
    //Con este metodo consultaremos las canciones.
    public String consultaCanciones() {

        Statement sta;
        String salidaCanciones = "";
        String request = "";
        
        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM canciones;";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                request = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Duracion: "
                        + rs.getString("duracion")
                        + "\n -----------------------------------");
                salidaCanciones = salidaCanciones + request;

            }

            rs.close();
            sta.close();
            return salidaCanciones;
        } catch (SQLException ex) {
             return ex.toString();

        }

    }

    //Con este metodo consultaremos la tabla Album mediante Autor.
    public String consulta_AlbumesAutor(String autor) {

        String salidaConsulta = "";
        String query = "SELECT * FROM album WHERE autor = ?;";

        try {
 
            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, autor);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Nº Canciones: " + rs.getString("numero_canciones")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    //Con este metodo consultaremos la tabla Album mediante Titulo.
    public String consulta_AlbumesTitulo(String titulo) {

        String salidaConsulta = "";
        String query = "SELECT * FROM album WHERE titulo = ?;";

        try {
 
            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, titulo);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Nº Canciones: " + rs.getString("numero_canciones")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }

    //Con este metodo consultaremos la tabla Canciones mediante Autor.
    public String consulta_CancionesAutor(String autor) {

        String salidaConsulta = "";
        String query = "SELECT * FROM canciones WHERE autor = ?;";

        try {

            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, autor);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Duracion: " + rs.getString("duracion")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    //Con este metodo consultaremos la tabla Canciones mediante Titulo.
    public String consulta_CancionesTitulo(String titulo) {

        String salidaConsulta = "";
        String query = "SELECT * FROM canciones WHERE titulo = ?;";

        try {

            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, titulo);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Titulo: " + rs.getString("titulo")
                        + "\n Autor: " + rs.getString("autor")
                        + "\n Duracion: " + rs.getString("duracion")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    //Con este metodo modificaremos el Titulo de canciones mediante el Autor.
    public void modificarCancion(String nuevoTitulo, String autor) {

         Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("UPDATE canciones SET titulo = " + "'" + nuevoTitulo + "'" + " WHERE autor =" + "'" + autor + "'" + ";" );
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar los datos");

        }

    }
    
    //Esta funcion servira para que se puedan seleccionar los datos desde los combo box
    public ArrayList<String> comboComp() {
        
        ArrayList<String> list = new ArrayList<String>();
        String query = "SELECT * FROM `marcas` ORDER BY `id_marcas`";
        
        
        try {
            
            Statement sta = conn1.createStatement();
            ResultSet rs = sta.executeQuery(query);
            
            while (rs.next()) {
                
                list.add(rs.getInt("id_marcas") + " - " + rs.getString("nombre"));
            }
            
            rs.close();
            sta.close();
            
            return list;
            
        } catch (SQLException ex) {
            
            System.out.println(ex.toString());
            return null;
            
        } catch (Exception e) {
            return null;
        }
    }
    
    
    //Esta funcion se queda hecha para el proyecto final, pero por el momento no tendra uso alguno.
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

            if (conn1 != null) {
                try {
                    conn1.rollback();
                } catch (SQLException ex1) {
                    System.out.println("Error al insertar los datos");
                }

            }

        }

    }

}
