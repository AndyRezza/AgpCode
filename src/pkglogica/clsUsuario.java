/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkglogica;

/**
 *
 * @author Gustavo Forero
 */
public class clsUsuario {
           public String nombre ;
           public String id ;
           public String apellido;
           public String nombreusuario ;
           public String contrasena;
           public int idleccion;
           public int idleccionjs;
           public int idleccionruby;
           public clsUsuario () {
               
           }

    public int getIdleccionjs() {
        return idleccionjs;
    }

    public void setIdleccionjs(int idleccionjs) {
        this.idleccionjs = idleccionjs;
    }

    public int getIdleccionruby() {
        return idleccionruby;
    }

    public void setIdleccionruby(int idleccionruby) {
        this.idleccionruby = idleccionruby;
    }

    public int getIdleccion() {
        return idleccion;
    }

    public void setIdleccion(int idleccion) {
        this.idleccion = idleccion;
    }

    

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
     
}
