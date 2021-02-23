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
    
    //Con este metodo insertaremos nuevos datos en la tabla Perifericos.
    public void insertarPerifericos(String monitor, String teclado, String raton, String auriculares, int marcas_perifericos) {

        Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("INSERT INTO perifericos (monitor, teclado, raton, auriculares, marcas_perifericos) VALUES"
            +"('" + monitor + "', '" + teclado + "', '" + raton + "', '" + auriculares + "', '" + marcas_perifericos + "');");
            
            sta.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar los datos");

        }

    }

    //Con este metodo consultaremos los Perifericos.
    public String consultaPerifericos() {

        Statement sta;
        String salidaAlbumes = "";
        String request = "";
        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM perifericos;";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                request = ("\n --------Resultados:----------"
                        + "\n Monitor: " + rs.getString("monitor")
                        + "\n Teclado: " + rs.getString("teclado")
                        + "\n Raton: " + rs.getString("raton")
                        + "\n Auriculares: " + rs.getString("auriculares")
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
    
    //Con este metodo consultaremos los Componentes.
    public String consultaComponentes() {

        Statement sta;
        String salidaCanciones = "";
        String request = "";
        
        try {

            sta = conn1.createStatement();

            String query = "SELECT * FROM componentes;";
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                request = ("\n --------Resultados:----------"
                        + "\n Procesador: " + rs.getString("procesador")
                        + "\n Disipador: " + rs.getString("disipador")
                        + "\n Placa Base: " + rs.getString("placa_base")
                        + "\n Tarjeta Grafica: " + rs.getString("tarjeta_grafica")
                        + "\n Torre: " + rs.getString("torre")
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
    
    //Con este metodo consultaremos la tabla Perifericos segun la marca.
    public String consulta_PerifericosMarca(String marcaperif) {

        String salidaConsulta = "";
        String query = "SELECT * FROM perifericos WHERE marcas_perifericos = ?;";

        try {

            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, marcaperif);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Monitor: " + rs.getString("monitor")
                        + "\n Teclado: " + rs.getString("teclado")
                        + "\n Raton: " + rs.getString("raton")
                        + "\n Auriculares: " + rs.getString("auriculares")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    //Con este metodo consultaremos la tabla Componentes segun la marca.
    public String consulta_ComponentesMarca(String marcacomp) {

        String salidaConsulta = "";
        String query = "SELECT * FROM componentes WHERE marcas_componentes = ?;";

        try {

            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1, marcacomp);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                salidaConsulta = ("\n --------Resultados:----------"
                        + "\n Procesador: " + rs.getString("procesador")
                        + "\n Disipador: " + rs.getString("disipador")
                        + "\n Placa Base: " + rs.getString("placa_base")
                        + "\n Tarjeta Grafica: " + rs.getString("tarjeta_grafica")
                        + "\n Torre: " + rs.getString("torre")
                        + "\n -----------------------------------");

            }

            rs.close();
            pst.close();
            return salidaConsulta;
        } catch (SQLException ex) {
            return ex.toString();

        }

    }
    
    //Con este metodo modificaremos la Torre segun la Marca.
    public void modificarTorre(String nuevaTorre, int marcas_comps) {

         Statement sta;

        try {

            sta = conn1.createStatement();
            sta.executeUpdate("UPDATE componentes SET torre = " + "'" + nuevaTorre + "'" + " WHERE marcas_componentes ="  + marcas_comps  + ";" );
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

            

    //Esta funcion borrara los datos de componentes y de perifericos segun la marca, si falla una de las dos consultas, la otra no se aplicara.
    public void deletearConCommit(int marcaDelete) {

        Statement sta;

        try {

            conn1.setAutoCommit(false);

            sta = conn1.createStatement();

            sta.executeUpdate("DELETE FROM componentes WHERE marcas_componentes =" + marcaDelete + " ;");
            sta.executeUpdate("DELETE FROM perifericos WHERE marcas_perifericos =" + marcaDelete + " ;");

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
