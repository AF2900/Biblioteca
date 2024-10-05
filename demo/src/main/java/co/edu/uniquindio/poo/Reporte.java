package co.edu.uniquindio.poo;

public class Reporte {
    private double totalPagar;
    
    public Reporte(double totalPagar){
        this.totalPagar = totalPagar;
    }
    
    public double getTotalPagar() {
        return totalPagar;
    }
    
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    @Override
    public String toString() {
        return "El total a pagar por el prestamo del libro es: " + totalPagar + "\n";
    }
}

