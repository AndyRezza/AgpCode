/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkglogica;

/**
 *
 * @author Andres Rezza
 */
public class clsLeccion_rb {
    public int id;
    public String nombre;
    public String actividad;
    public String respuesta;
    public String tituloteoria;
    public String teoria;
    public String observacion;
    public int Ultimoid;

    public int getUltimoid() {
        return Ultimoid;
    }

    public void setUltimoid(int Ultimoid) {
        this.Ultimoid = Ultimoid;
    }
    
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getTituloteoria() {
        return tituloteoria;
    }

    public void setTituloteoria(String tituloteoria) {
        this.tituloteoria = tituloteoria;
    }

    public String getTeoria() {
        return teoria;
    }

    public void setTeoria(String teoria) {
        this.teoria = teoria;
    }

    
}
