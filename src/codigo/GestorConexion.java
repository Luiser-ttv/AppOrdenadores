/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Connection;
import java.sql.DriverManager;
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

}
