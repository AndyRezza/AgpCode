package pkgdatos ;

import java.sql.*;


public class dbConexion {
    public String bd = "agpcode";
    public String usuario = "root";
    public String clave = "";
    public String url = "jdbc:mysql://localhost/"+bd;
    Connection conn = null;
  

    public dbConexion() {
        try {
            //obtenemos el driver de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            conn = DriverManager.getConnection(url, usuario, clave);
            if (conn!=null){
                System.out.println("Conexion a base de datos "+bd+". listo");
            }
        }
        catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url+"\n"+ex);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    
  
  /**Permite retornar la conexió
     * @return n*/
   public Connection getConexion(){
      return conn;
   }
}
