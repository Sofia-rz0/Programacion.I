package co.edu.uniquindio;

import java.util.List;

public class Materia {

    private String nombre, id;
    private Docente docente;
    private List<Estudiante> listEstudiantes;

    public Materia(String nombre, String id, Docente docente, List<Estudiante> listEstudiantes) {
        this.nombre = nombre;
        this.id = id;
        this.docente = docente;
        this.listEstudiantes = listEstudiantes;
    }

    public void registrarEstudiante(Estudiante estudiante) {
        listEstudiantes.add(estudiante);
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
