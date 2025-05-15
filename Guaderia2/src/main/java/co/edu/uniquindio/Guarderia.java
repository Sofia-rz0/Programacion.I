package co.edu.uniquindio;

import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private ArrayList<Ninio> listNinios;


    public Guarderia(String nombre) {
        this.nombre = nombre;
        this.listNinios = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(ArrayList<Ninio> listNinios) {
        this.listNinios = listNinios;
    }

    public boolean verificarNinio(Ninio ninio) {
        boolean verficado = true;
        for (Ninio ninios : listNinios) {
            if (ninio.getId().equals(ninio.getId())) {
                verficado = false;
            }
        }
        return verficado;
        }

    }
    public void almacenarNinios(Ninio ninio){
    if(verificarNinio(ninio)){
        ListNinios.add(ninio);
        system.out.println("ALMACENADO");

    }else{
        system.out.println("NO ALLMACENADO");
    }



    public ArrayList<Ninio> obtenerMayores5(ArrayList<Ninio> listNinios) {
        ArrayList<Ninio> listMayores5 = new ArrayList<>();
        for (int i = 0; i <= listNinios.size(); i++) {
            if (listNinios.get(i).getEdad() > 5) {
                listMayores5.add(listNinios.get(i));
            }
        }
        return listMayores5;
    }



}

