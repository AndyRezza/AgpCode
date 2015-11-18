/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkglogica.clsLeccion_rb;
/**
 *
 * @author Andres Rezza
 */
public class dbLeccion_rb {
    dbConexion cn;
    
    
    public dbLeccion_rb() {
        cn = new dbConexion();
    }
     public clsLeccion_rb getLeccionById(int id){
        clsLeccion_rb data = new clsLeccion_rb();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM leccion_rb " + 
                                                " where idleccion = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbLeccion dbc = new dbLeccion();
            if(res.next()){
                data = new clsLeccion_rb();
                data.setTituloteoria(res.getString("tituloteoria"));
                data.setTeoria(res.getString("teoria"));
                data.setActividad(res.getString("actividad"));
                data.setRespuesta(res.getString("respuesta"));
                
                
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
       
    public int insertarLeccion(clsLeccion_rb c){
        int resultado = 0;//no hubo errores de validacion
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                   "insert into leccion_rb (nombre," +
                                           " actividad, "+
                                           " respuesta, "+
                                           " tituloteria, "+
                                           " teoria, "+
                                           
                                           " observacion, "+
                                   " values(?,?,?,?,?,?)");
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getActividad());
            pstm.setString(3, c.getRespuesta());
            pstm.setString(4, c.getTeoria());
            
            pstm.setString(5, c.getObservacion());

            pstm.executeUpdate();

            pstm = cn.getConexion().prepareStatement("select last_insert_id()");
            ResultSet res = pstm.executeQuery();
            res.next();
            resultado = res.getInt(1);
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public int actualizarLeccion(clsLeccion_rb c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                       "update leccion_rb " +
                                       " set nombre = ?, "+
                                       " set actividad = ?, "+
                                       " set respuesta = ?, "+
                                        " tituloteria = ? "+
                                       " set teoria = ?, "+
                                       
                                      " set observacion = ?, ");
           pstm.setString(1, c.getNombre());
           pstm.setString(2, c.getActividad());
           pstm.setString(3, c.getRespuesta());
           pstm.setString(4, c.getTituloteoria());
           pstm.setString(5, c.getTeoria());
           
           pstm.setString(6, c.getObservacion());
           
            resultado = pstm.executeUpdate();

        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public int borrarLeccion(clsLeccion_rb c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                  "delete from leccion_rb " +
                                  " where idleccion = ?");
            
            pstm.setInt(1, c.getId());

            resultado = pstm.executeUpdate();
                    
        }catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }

    public clsLeccion_rb[] getTituloLeccion(){
        int registros = 0;
      
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_rb ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_rb[] data = new clsLeccion_rb[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_rb " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
           ;
            while(res.next()){
                data[i] = new clsLeccion_rb();
                data[i].setId(res.getInt("idleccion"));
                data[i].setTituloteoria(res.getString("tituloteoria"));
                i++;
            }
            res.close(); 
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    public clsLeccion_rb[] getRespuestaLeccion(){
        int registros = 0;
      
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_rb ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_rb[] data = new clsLeccion_rb[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_jrb " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
           ;
            while(res.next()){
                data[i] = new clsLeccion_rb();
                data[i].setRespuesta(res.getString(""));
                i++;
            }
            res.close(); 
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    public clsLeccion_rb[] getLeccion(){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_rb ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_rb[] data = new clsLeccion_rb[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_rb " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
          
            while(res.next()){
                data[i] = new clsLeccion_rb();
                data[i].setTituloteoria(res.getString("tituloteoria"));
                data[i].setTeoria(res.getString("teoria"));
                data[i].setRespuesta(res.getString("respuesta"));
                data[i].setObservacion(res.getString("observacion"));
                data[i].setNombre(res.getString("nombre"));
                data[i].setActividad(res.getString("actividad"));
                data[i].setId(res.getInt("idleccion"));
               
                
                
                i++;
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }

 public clsLeccion_rb getLeccionByUsuario(int id){
        clsLeccion_rb data = new clsLeccion_rb();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM leccion_rb " + 
                                                " where idleccion = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
           
            if(res.next()){
                data = new clsLeccion_rb();
                data.setNombre(res.getString("nombre"));
                
                
                
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
 public clsLeccion_rb getUltimoidleccion(int id){
        clsLeccion_rb data = new clsLeccion_rb();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                           "SELECT MAX(idleccion) AS id FROM leccion_rb " );

            ResultSet res = pstm.executeQuery();
            if(res.next()){
                data = new clsLeccion_rb();
                data.setUltimoid(res.getInt(""));   
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
}
