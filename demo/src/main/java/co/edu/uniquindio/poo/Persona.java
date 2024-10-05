package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String id;
    public String telefono;
    public String correo;

    public Persona(String nombre, String id, String telefono, String correo){
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +"\n"+ "Número de identificación: " + id +"\n"+ "Número telefónico: " + telefono +"\n"+ "Correo electrónico: " + correo + "\n";
    }
}
