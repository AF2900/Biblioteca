package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca();
        Bibliotecario bibliotecario1= new Bibliotecario("Andrián perez", "5550102812", "0012141", "Love@gmail.com", 900.01);
        Estudiante estudiante1=new Estudiante("Jim Milton", "092141", "5550109", "Vander@imail.com");
        Libro libro1= new Libro("Diario 3", "999999", "092141", "Standford Pines", "Gravity Falls");
        Prestamo prestamoLibro1= new Prestamo(true, 2);

        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarPrestamo(prestamoLibro1);
        
        biblioteca.mostrarDatosLibro();
        biblioteca.mostrarDatosEstudiante();
        biblioteca.mostrarDatosBibliotecario();
        biblioteca.mostrarDatosReporte();


    }
}
