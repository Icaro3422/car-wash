/*
 *Conexion a base de datos
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class conexion {
    
    private static Connection conexion; 
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3307/autoestero";

    public conexion() {
        
        conexion = null;
        
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            
            
        //if (conexion != null) {System.out.println("Conexión establecida");}
            
        }catch(ClassNotFoundException | SQLException e){
         
            //System.out.println("error al conectar "+e);
            JOptionPane.showMessageDialog(null, e);
        }
         
    }
     
    //este método retorna la conexión a la base de datos 
     public Connection getConnection(){
         return conexion;
     }
     //este método desconecta la base de datos 
    public void desconectar(){
        conexion = null;
        if(conexion == null){
            System.out.println("Conexión terminada");
        }
    }
    
     
}
