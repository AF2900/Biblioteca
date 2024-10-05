package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona{
    private double salario;

    public Bibliotecario(String nombre, String id, String telefono, String correo, double salario){
        super(nombre, id, telefono, correo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre del bibliotecario: " + nombre +"\n"+ "El salario del bibliotecario es: " + salario +"\n"+ "El número de identificación del bibliotecario es: " + id +"\n"+ "El número telefónico del bibliotecario es: " + telefono
                +"\n"+ "El correo electrónico del bibliotecario es: " + correo + "\n";
    }
}
