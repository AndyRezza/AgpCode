package pkglogica;

/**
 *
 * 
 */
public class clsLeccion {
           public int id ;
           public String nombre ;
           public String actividad ;
           public String respuesta;
           public String tituloteoria;
           public String teoria;
           public int ultimoid;
           
           public String observacion;

    @Override
    public String toString() {
        return tituloteoria ;
    }

    public int getUltimoid() {
        return ultimoid;
    }

    public void setUltimoid(int ultimoid) {
        this.ultimoid = ultimoid;
    }

          
           public clsLeccion () {
               
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
          
    public class Titulos {

    protected String idTitulo;

    protected String nombre;

        public String getIdTitulo() {
            return idTitulo;
        }

        public void setIdTitulo(String idTitulo) {
            this.idTitulo = idTitulo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

   

    public Titulos(String idtitulo, String nombre) {
        this.idTitulo=idTitulo;
        this.nombre = nombre;


    }    

}
           
           
           
}