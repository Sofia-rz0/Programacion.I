package co.edu.uniquindio;

public class Docente {

    private String nombre, titulo;

    public Docente(String nombre, String titulo) {
        this.nombre = nombre;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
