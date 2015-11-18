/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pkglogica.clsUsuario;
import pkgVista.Principal_1;
/**
 *
 * 
 */
public class dbUsuario {
  dbConexion cn;
  Principal_1 nombre;   
  public clsUsuario getEstudianteBynombredeusuario(String nombreusuario){
        clsUsuario c = new clsUsuario();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                        "SELECT * FROM usuario " + 
                                        " WHERE nombreusuario = ? ");
            pstm.setString(1, nombreusuario);
            ResultSet res = pstm.executeQuery();
            if(res.next()){
               c.setNombre(res.getString("nombre"));
               c.setId(res.getString("idusuario"));
               c.setApellido(res.getString("apellido"));
               c.setContrasena(res.getString("contraseña"));
               c.setNombreusuario(res.getString("nombreusuario"));
               c.setIdleccion(res.getInt("id_leccion"));
               c.setIdleccionjs(res.getInt("id_leccionjs"));
               c.setIdleccionruby(res.getInt("id_leccionruby"));
                
            }
            res.close(); 
           
        }catch(SQLException e){
            System.out.println(e);
        }
       return c;
    }
 
    public dbUsuario() {
        cn = new dbConexion();
    }
    /** trae todos los registros de la tabla contactos */
     public clsUsuario[] getEstudiante(){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion ().prepareStatement(
                   "SELECT count(1) as cont" +
                   " FROM usuario ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsUsuario[] data = new clsUsuario[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                               "SELECT idusuario, " +
                               " nombre, " +
                               " apellido, " +
                               " nombreusuario, " +
                               " contraseña, " +
                               " id_leccion, " +
                               " id_leccionjs, " +
                               " id_leccionruby, " +
                               " FROM usuario " + 
                               " ORDER BY NOMBRE, APELLIDO ");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                data[i] = new clsUsuario();
                data[i].setId(res.getString("idusuario"));
                data[i].setNombre(res.getString("nombre"));
                data[i].setApellido(res.getString("apellido"));
                data[i].setNombreusuario(res.getString("nombreusuario"));
                data[i].setContrasena(res.getString("contraseña"));
                data[i].setIdleccion(res.getInt("id_leccion"));
                data[i].setIdleccion(res.getInt("id_leccionjs"));
                data[i].setIdleccion(res.getInt("id_leccionruby"));
                
                i++;
            }
            res.close(); 
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
     
     public int agregarestudiante (clsUsuario c){
        int resultado = 0;//no hubo errores de validacion
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                   "insert into usuario (nombre," +
                                   " apellido," +
                                   " nombreusuario, "+
                                   " contraseña, " +
                                   " id_leccion, " +
                                   " id_leccionjs, " +
                                   " id_leccionruby) " +
                                   " values(?,?,?,?,?,?,?)");

            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getApellido());
            pstm.setString(3, c.getNombreusuario());
            pstm.setString(4, c.getContrasena());
            pstm.setInt(5, c.getIdleccion());
            pstm.setInt(6, c.getIdleccionjs());
            pstm.setInt(7, c.getIdleccionruby());
            pstm.executeUpdate();

            pstm = cn.getConexion().prepareStatement("select last_insert_id()");
            ResultSet res = pstm.executeQuery();
            res.next();
            resultado = res.getInt(1);
            res.close();
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Intente otro nombre de Usuario, este ya Existe!");
        }
        return resultado;
    }
    
    
    public int actualizarContacto(clsUsuario c){
        int resultado = 0;
        
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                       "update usuario" +
                                       " set nombre = ?, " +
                                       " apellido = ?," +
                                       " nombreusuario = ?," +
                                       " contraseña = ? " +
                                       
                                       " where idusuario = ? ");
            
           
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getApellido());
            pstm.setString(3, c.getNombreusuario());
            pstm.setString(4, c.getContrasena());
            pstm.setString(5, c.getId());
            
            
            resultado = pstm.executeUpdate();
                
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
   public int actualizarId_leccion(clsUsuario c){
        int resultado = 0;
        
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                       "update usuario" +
                                       " set nombre = ?, " +
                                       " apellido = ?," +
                                       " nombreusuario = ?," +
                                       " contraseña = ? ," +
                                       " id_leccion = ? ," +
                                       " id_leccionjs = ? ," +
                                       " id_leccionruby = ? " +
                                       " where idusuario = ? ");
            
           
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getApellido());
            pstm.setString(3, c.getNombreusuario());
            pstm.setString(4, c.getContrasena());
            pstm.setInt(5, c.getIdleccion());
            pstm.setInt(6, c.getIdleccionjs());
            pstm.setInt(7, c.getIdleccionruby());
            pstm.setString(8, c.getId());
            
            
            
            resultado = pstm.executeUpdate();
                
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    } 

}
