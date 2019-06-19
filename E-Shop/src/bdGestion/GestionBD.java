/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdGestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author BROTHERS
 */
public class GestionBD {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    String DRIVER = "org.sqlite.JDBC";
    String NOMBREBD = "Compra - Venta de Productos.sqlite";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    
    //*creacion de una base de datos
    public void crearBD(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException   e){
            JOptionPane.showMessageDialog(null, "Error"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//*fin codigo
    
    
    
}
