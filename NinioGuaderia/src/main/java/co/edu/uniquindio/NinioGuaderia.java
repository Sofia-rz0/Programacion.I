package co.edu.uniquindio;

public class NinioGuaderia {
    private String nombre;
    private int edad;
    private char genero;
    private int id;
    private String alergias, acudiente;
    private int numeroContacto;

    public NinioGuaderia(String nombre,int edad, char genero, int id, String alergias, String acudiente, int numeroContacto) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
    this.id = id;
    this.alergias = alergias;
    this.acudiente = acudiente;
    this.numeroContacto = numeroContacto;

    }

    public String toString() {
        return "Niño ("+nombre+","+edad+","+genero+","+id+")";



    }
}
