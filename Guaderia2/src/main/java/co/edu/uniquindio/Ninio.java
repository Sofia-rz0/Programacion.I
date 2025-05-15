package co.edu.uniquindio;

public class Ninio {
    private String id;
    private String nombre;
    private int edad;
    private char genero;
    private int documento;
    private String alergias;
    private String nombreAcudiente;
    private int numeroAcudiente;

    public Ninio(String id, String nombre, int edad, char genero, int documento, String alergias, String nombreAcudiente, int numeroAcudiente ) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }
    public int getNumeroAcudiente() {
        return numeroAcudiente;
    }
    public void setNumeroAcudiente(int numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }

    @Override
    public String toString() {
        return "Ninio("+id+nombre+edad+genero+documento+alergias+nombreAcudiente+numeroAcudiente+")";
    }
}


