package pkgdatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkglogica.clsConstancia;

/**
 *
 * @author Andrez Rezza
 */
public class dbConstancia {
    
     dbConexion cn;
    
    public dbConstancia() {
        cn = new dbConexion();
    }
    
    public clsConstancia getCertificadoById(int id){
        clsConstancia data = new clsConstancia();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM constancia " + 
                                                " where idconstancia = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbUsuario dbc = new dbUsuario();
            if(res.next()){
                data = new clsConstancia();
                data.setIdconstancia(res.getInt("idconstancia"));
                data.setIdusuario(res.getInt("idusuario"));
                data.setIdleccion(res.getInt("idleccion"));
                data.setObservacion(res.getString("observacion"));
              
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    
    /** trae todas las citas de un contacto*/
    public clsConstancia[] getCertificadoByIdUsuario(int idcontacto){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM constancia ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsConstancia[] data = new clsConstancia[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM Constancia WHERE idconstancia = ? " );

            pstm.setInt(1, idcontacto);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbUsuario dbc = new dbUsuario();
            while(res.next()){
                data[i] = new clsConstancia();
                data[i].setIdconstancia(res.getInt("idconstancia"));
                data[i].setIdusuario(res.getInt("idusuario"));
                data[i].setIdleccion(res.getInt("idleccion"));
                data[i].setObservacion(res.getString("observacion"));
                
                i++;
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;    }
    
    /** trae todos los registros de la tabla citas */
     public clsConstancia[] getConstancia(){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM constancia ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsConstancia[] data = new clsConstancia[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM constancia " );

            ResultSet res = pstm.executeQuery();
            int i = 0;
             dbUsuario dbc = new dbUsuario();
            while(res.next()){
                data[i] = new clsConstancia();
                data[i].setIdconstancia(res.getInt("idconstancia"));
                data[i].setIdusuario(res.getInt("idusuario"));
                data[i].setIdleccion(res.getInt("idleccion"));
                data[i].setObservacion(res.getString("observacion"));
                i++;
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
     
    
    
    public int borrarConstancia(clsConstancia c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                  "delete from constancia " +
                                  " where idconstancia = ?");
            
            pstm.setInt(1, c.getIdconstancia());

            resultado = pstm.executeUpdate();
                    
        }catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }

}
