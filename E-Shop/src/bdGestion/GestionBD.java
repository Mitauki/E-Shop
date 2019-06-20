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
    String NOMBREBD = "CompraVenta_eshop";
    String URL = "jdbc:sqlite:"+NOMBREBD;
    
    
    //*creacion de una base de datos
    public void crearBD(){
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException   e){
            JOptionPane.showMessageDialog(null, "Error"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
<<<<<<< HEAD
        JOptionPane.showMessageDialog(null,"Base de Datos creada con Exito :D");
    }//*fin codigo  
 
    //*creacion de Tabla Cliente
    public void CrearTabla1(){
    
     try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE CLIENTE(" +
                         "ID INT PRIMARY KEY NOT NULL, " +
                         "NOMBRE TEXT NOT NULL, " +
                         "APELLIDO TEXT NOT NULL,"+
                         "EMAIL TEXT NOT NULL)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla creada!!");
    
    }//fin codigo...
    
    //*creacion de Tabla Producto
    public void CrearTabla2(){
    
     try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE PRODUCTO(" +
                         "CODIGO_PRODUCTO   INT     PRIMARY KEY NOT NULL, " +
                         "NOMBRE    TEXT     NOT NULL, " +
                         "PRECIO    INT     NOT NULL,"+
                         "STOCK     INT     NOT NULL,"+
                         "CATEGORIA TEXT  NOT NULL,"+
                         "ID_PROVEEDOR INT NOT NULL," +
                         "FOREIGN KEY(ID_PROVEEDOR)REFERENCES PROVEEDOR(ID))";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla creada!!");
    
    
    }//fin codigo...
    
    //*creacion de Tabla Venta
    public void CrearTabla3(){
     try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE VENTA(" +
                         "ID         INT   PRIMARY KEY NOT NULL, " +
                         "ID_CLIENTE INT   NOT NULL,"+
                         "FECHA      DATE  NOT NULL,"+
                         "MODO DE PAGO  TEXT NOT NULL,"+ 
                         "FOREIGN KEY(ID_CLIENTE)REFERENCES CLIENTE(ID))";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla creada!!");
   
    }//fin codigo...
    
    //*creacion de Tabla VentaDetalle
    public void CrearTabla4(){
    
    try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE VENTADETALLE(" +
                         "ID             INT   PRIMARY KEY NOT NULL, " +
                         "ID_VENTA       INT   NOT NULL,"+
                         "ID_PRODUCTO    INT   NOT NULL,"+
                         "CANTIDAD       INT   NOT NULL,"+ 
                         "TOTALCOMPRA    INT   NOT NULL,"+
                         "FOREIGN KEY(ID_VENTA)REFERENCES VENTA(ID),"+
                         "FOREIGN KEY(ID_PRODUCTO)REFERENCES PRODUCTO(ID))";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla creada!!");
    
    
    
    }//fin codigo...
    
    //*creacion de Tabla Proveedor
    public void CrearTabla5(){
     try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "CREATE TABLE PROVEEDOR(" +
                         "ID          INT    PRIMARY KEY NOT NULL, " +
                         "NOMBRE      TEXT   NOT NULL,"+
                         "DESCRIPCION TEXT   NOT NULL,"+
                         "DIRECCION   TEXT   NOT NULL)";
                         
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla creada!!");
    
    
    
    }//fin codigo...
    
    //*eliminacion de Tablas 
    public void EliminarTabla(){
    
    try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL);
            
            sentencia = conexion.createStatement();
            String sql = "DROP TABLE CATEGORIA";
                         
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e, 
                    "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"tabla Eliminada!!");
    }//fin codigo...
    
    public static void main(String[] args) {
        GestionBD gbd = new GestionBD();
        
        //*gbd.crearBD();
        //*gbd.CrearTabla1();
        //*gbd.CrearTabla2();
        //*gbd.CrearTabla3();
        //*gbd.CrearTabla4();
        //*gbd.CrearTabla5();
        //*gbd.EliminarTabla();
    }
    
=======
        JOptionPane.showMessageDialog(null,"Base de datos Creada!","Exito!",
                JOptionPane.WARNING_MESSAGE);
        
    }//*fin codigo 
>>>>>>> 13c55b893509e59e5c396ddd0196920931c7ac83
}
