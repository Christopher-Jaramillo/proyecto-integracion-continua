package ec.edu.epn;

import java.util.Arrays;

public class LugarTuristico {

    public String nombreLugar;
    public String categoria;
    public String horarioAtencion;
    public String diasAtencion;
    public String direccion;
    public float  calificacion;
    public String [] medidas;
    public String comentario;

    public LugarTuristico() {
    }

    public LugarTuristico(String nombreLugar, String categoria, String horarioAtencion, String diasAtencion, String direccion, float calificacion, String[] medidas, String comentario) {
        this.nombreLugar = nombreLugar;
        this.categoria = categoria;
        this.horarioAtencion = horarioAtencion;
        this.diasAtencion = diasAtencion;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.medidas = medidas;
        this.comentario = comentario;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getDiasAtencion() {
        return diasAtencion;
    }

    public void setDiasAtencion(String diasAtencion) {
        this.diasAtencion = diasAtencion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String[] getMedidas() {
        return medidas;
    }

    public void setMedidas(String[] medidas) {
        this.medidas = medidas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean registrarLugarTuristico(String nombreLugar, String categoria, String horarioAtencion, String diasAtencion, String direccion, float calificacion, String[] medidas, String comentario){

        if(nombreLugar != null && categoria != null && horarioAtencion != null && diasAtencion != null && direccion != null
        && medidas !=null  ){
            this.setNombreLugar(nombreLugar);
            this.setCategoria(categoria);
            this.setHorarioAtencion(horarioAtencion);
            this.setDiasAtencion(diasAtencion);
            this.setDireccion(direccion);
            this.setCalificacion(calificacion);
            this.setMedidas(medidas);
            this.setComentario(comentario);

            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "LugarTuristico{" +
                "nombreLugar='" + nombreLugar + '\'' +
                ", categoria='" + categoria + '\'' +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                ", diasAtencion='" + diasAtencion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", calificacion=" + calificacion +
                ", medidas=" + Arrays.toString(medidas) +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
