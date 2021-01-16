package ec.edu.epn;

public class Administrador {

    public String dni;
    public String nombre;
    public String direccion;
    public String telefono;
    public String correo;

    public Administrador() {
    }

    public Administrador(String dni, String nombre, String direccion, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public boolean registrarAdministrador(String dni, String nombre, String direccion, String telefono, String correo){
        if (dni!=null && nombre!=null && direccion!=null && telefono!=null && correo!=null ){

            this.setDni(dni);
            this.setNombre(nombre);
            this.setDireccion(direccion);
            this.setTelefono(telefono);
            this.setCorreo(correo);

            return true;
        }
        else {return false;}

    }


}
