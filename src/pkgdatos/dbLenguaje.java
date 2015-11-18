/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgdatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkglogica.clsLenguaje;  

/**
 *
 * @author Mauro España
 */
public class dbLenguaje {
     dbConexion cn;
    
    public dbLenguaje() {
        cn = new dbConexion();
    }

    /** trae una cita por su id*/
    public clsLenguaje getNotaById(int id){
        clsLenguaje data = new clsLenguaje();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM lenguaje " + 
                                                " where idlenguaje = ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbLeccion dbc = new dbLeccion();
            if(res.next()){
                data = new clsLenguaje();
                data.setNombre(res.getString("nombre"));
                data.setObservacion(res.getString("observacion"));
                
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    
    /** trae todas las citas de un contacto*/
    public clsLenguaje[] getLenguajeByIdEstudiante(int idlenguaje){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM lenguaje ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLenguaje[] data = new clsLenguaje[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM usuario WHERE idlenguaje=? "); 

            pstm.setInt(1, idlenguaje);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbUsuario dbc = new dbUsuario();
            while(res.next()){
                data[i] = new clsLenguaje();
                data[i].setNombre(res.getString("nombre"));
                data[i].setObservacion(res.getString("observacion"));
               
                i++;
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;    }
    
    /** trae todos los registros de la tabla citas */
     public clsLenguaje[] getLenguaje(){
        int registros = 0;

        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                     "SELECT count(1) as cont" +
                                     " FROM lenguaje ");
            
            ResultSet res = pstm.executeQuery();

            res.next();
            registros = res.getInt("cont");
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        clsLenguaje[] data = new clsLenguaje[registros];
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                      "SELECT * FROM lenguaje " );
                                      

            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbUsuario dbc = new dbUsuario();
            while(res.next()){
                data[i] = new clsLenguaje();
                data[i].setNombre(res.getString("nombre"));
                data[i].setObservacion(res.getString("observacion"));
                
                i++;
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
     
    
    
    public int actualizarNota(clsLenguaje c){
        int resultado = 0;
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                       "update lenguaje " +
                                       " set nombre = ?, "
                                        +" set observacion = ?, ");
           pstm.setString(1, c.getNombre());
           pstm.setString(2, c.getObservacion());

            resultado = pstm.executeUpdate();

        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    




}