package co.edu.uniquindio.poo;

public class Prestamo {
private boolean estadoPrestamo;
private int cantidadPrestamos;

public Prestamo(boolean estadoPrestamo, int cantidadPrestamos){
    this.estadoPrestamo=estadoPrestamo;
    this.cantidadPrestamos=cantidadPrestamos;
}

public boolean isEstadoPrestamo() {
    return estadoPrestamo;
}

public void setEstadoPrestamo(boolean estadoPrestamo) {
    this.estadoPrestamo = estadoPrestamo;
}

public int getCantidadPrestamos() {
    return cantidadPrestamos;
}

public void setCantidadPrestamos(int cantidadPrestamos) {
    this.cantidadPrestamos = cantidadPrestamos;
}

@Override
public String toString() {
    return "El estado del prestamo es: " + estadoPrestamo +"\n"+ "La cantidad de prestamos del libro son: " + cantidadPrestamos + "\n";
}
 

}
