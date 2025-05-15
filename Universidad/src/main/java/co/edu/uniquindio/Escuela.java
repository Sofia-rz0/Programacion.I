package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private String nombre, id;
    private List<Docente> listDocentes;
    private List<Materia> listMaterias;
    private List<Nota> ListNotas;
    private List<Estudiante> listEstudiantes;

    /**
     * Metodo constructor de escuela
     * @param nombre
     * @param id
     */
    public Escuela(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listDocentes = new ArrayList<Docente>();
        this.listMaterias= new ArrayList<>();
        this.ListNotas= new ArrayList<>();
        this.listEstudiantes= new ArrayList<>();
    }

    /**
     * Metodo que permite registrar docente
     * @param docente
     */
    public void registrarDocente(Docente docente) {
        listDocentes.add(docente);
    }

    /**
     * Metodo que permite registrar materia
     * @param materia
     */
    public void registrarMateria(Materia materia) {
        listMaterias.add(materia);
    }

}
