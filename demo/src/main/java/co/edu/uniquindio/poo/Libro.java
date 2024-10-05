package co.edu.uniquindio.poo;
public class Libro {
private String nombre;
private String isbn;
private String codigo;
private String autor;
private String editorial;

public Libro(String nombre, String isbn, String codigo, String autor, String editorial){
    this.nombre=nombre;
    this.isbn=isbn;
    this.codigo=codigo;
    this.autor=autor;
    this.editorial=editorial;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getIsbn() {
    return isbn;
}

public void setIsbn(String isbn) {
    this.isbn = isbn;
}

public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getEditorial() {
    return editorial;
}

public void setEditorial(String editorial) {
    this.editorial = editorial;
}

@Override
public String toString() {
    return "El nombre del libro es: " + nombre +"\n"+ "El isbn del libro es: " + isbn +"\n"+ "El código del libro es: " + codigo +"\n"+ "El autor del libro es: " + autor +"\n"+ "La editorial del libro es: "
            + editorial + "\n";
}
    
}
