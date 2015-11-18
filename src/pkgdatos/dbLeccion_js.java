/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkglogica.clsLeccion_js;
/**
 *
 * @author Andres Rezza
 */
public class dbLeccion_js {
    dbConexion cn;
    
    
    public dbLeccion_js() {
        cn = new dbConexion();
    }
     public clsLeccion_js getLeccionById(int id){
        clsLeccion_js data = new clsLeccion_js();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM leccion_js " + 
                                                " where idleccion = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            
            if(res.next()){
                data = new clsLeccion_js();
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
       
    public int insertarLeccion(clsLeccion_js c){
        int resultado = 0;//no hubo errores de validacion
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                   "insert into leccion_js (nombre," +
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
    
    public int actualizarLeccion(clsLeccion_js c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                       "update leccion_js " +
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
    
    public int borrarLeccion(clsLeccion_js c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                  "delete from leccion_js " +
                                  " where idleccion = ?");
            
            pstm.setInt(1, c.getId());

            resultado = pstm.executeUpdate();
                    
        }catch(SQLException e){
            System.out.println(e);
        }

        return resultado;
    }

    public clsLeccion_js[] getTituloLeccion(){
        int registros = 0;
      
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_js ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_js[] data = new clsLeccion_js[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_js " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
           ;
            while(res.next()){
                data[i] = new clsLeccion_js();
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
    public clsLeccion_js[] getRespuestaLeccion(){
        int registros = 0;
      
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_js ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_js[] data = new clsLeccion_js[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_js " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
           ;
            while(res.next()){
                data[i] = new clsLeccion_js();
                data[i].setRespuesta(res.getString(""));
                i++;
            }
            res.close(); 
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    public clsLeccion_js[] getLeccion(){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM leccion_js ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLeccion_js[] data = new clsLeccion_js[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM leccion_js " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbLeccion dbc = new dbLeccion();
            while(res.next()){
                data[i] = new clsLeccion_js();
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

 public clsLeccion_js getLeccionByUsuario(int id){
        clsLeccion_js data = new clsLeccion_js();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM leccion_js " + 
                                                " where idleccion = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
           
            if(res.next()){
                data = new clsLeccion_js();
                data.setNombre(res.getString("nombre"));
                
                
                
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
 public clsLeccion_js getUltimoidleccion(int id){
        clsLeccion_js data = new clsLeccion_js();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                           "SELECT MAX(idleccion) AS id FROM leccion_js " );

            ResultSet res = pstm.executeQuery();
            if(res.next()){
                data = new clsLeccion_js();
                data.setUltimoid(res.getInt(""));   
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
}
