/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pkglogica.clsBusqueda;

/**
 *
 * @author Andrez Rezza
 */
public class dbBusqueda {
   dbConexion cn;
    
    public dbBusqueda() {
        cn = new dbConexion();
    }

    /** trae una cita por su id*/
   public clsBusqueda getBusquedaById(int id){
        clsBusqueda data = new clsBusqueda();
        try{
            PreparedStatement pstm = cn.getConexion().prepareStatement(
                                                "SELECT * FROM usuario " + 
                                                " where nombreusuario= ? ");

            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            dbUsuario dbc = new dbUsuario();
            if(res.next()){
                data = new clsBusqueda();
                data.setId(res.getInt("nombreusuario"));
                //data.setIdestudiante(dbc.getEstudianteById(res.getInt("ID_ESTUDIANTE")));
                data.setResultado(res.getString("RESULTADO"));
            }
            res.close(); 
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    
   
}
