package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> listaLibro;
    private LinkedList<Prestamo> listaPrestamo;
    private LinkedList<Estudiante> listaEstudiantes;
    private LinkedList<Bibliotecario> listaBibliotecarios;
    private LinkedList<Reporte> listaReportes;


public Biblioteca (){
    listaLibro= new LinkedList<>();
    listaPrestamo= new LinkedList<>();
    listaEstudiantes= new LinkedList<>();
    listaBibliotecarios= new LinkedList<>();
    listaReportes= new LinkedList<>();
    
}

public LinkedList<Reporte> getListaReportes() {
    return listaReportes;
}

public void setListaReportes(LinkedList<Reporte> listaReportes) {
    this.listaReportes = listaReportes;
}

public LinkedList<Estudiante> getListaEstudiantes() {
    return listaEstudiantes;
}

public void setListaEstudiantes(LinkedList<Estudiante> listaEstudiantes) {
    this.listaEstudiantes = listaEstudiantes;
}

public LinkedList<Bibliotecario> getListaBibliotecarios() {
    return listaBibliotecarios;
}

public void setListaBibliotecarios(LinkedList<Bibliotecario> listaBibliotecarios) {
    this.listaBibliotecarios = listaBibliotecarios;
}

public LinkedList<Libro> getListaLibro() {
    return listaLibro;
}

public void setListaLibro(LinkedList<Libro> listaLibro) {
    this.listaLibro = listaLibro;
}

public LinkedList<Prestamo> getListaPrestamo() {
    return listaPrestamo;
}

public void setListaPrestamo(LinkedList<Prestamo> listaPrestamo) {
    this.listaPrestamo = listaPrestamo;
}

public void agregarLibro(Libro nuevoLibro){
    listaLibro.add(nuevoLibro);
}

public void agregarPrestamo(Prestamo nuevoPrestamo){
    listaPrestamo.add(nuevoPrestamo);
}
public void agregarEstudiante(Estudiante nuevoEstudiante){
    listaEstudiantes.add(nuevoEstudiante);
}
public void agregarBibliotecario(Bibliotecario nuevobBibliotecario){
    listaBibliotecarios.add(nuevobBibliotecario);
}

public void mostrarDatosLibro(){
    mostrarMensaje(listaLibro.toString());

}
public void mostrarDatosEstudiante(){
    mostrarMensaje(listaEstudiantes.toString());

}
public void mostrarDatosBibliotecario(){
    mostrarMensaje(listaBibliotecarios.toString());

}

public void mostrarDatosReporte(){
    mostrarMensaje(listaReportes.toString());
}

public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
}

}