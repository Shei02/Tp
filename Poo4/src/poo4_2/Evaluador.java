package poo4_2;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private String nombre;
    private boolean esExperto;
    private List<String> temasConocidos;

    public Evaluador(String nombre, boolean esExperto) {
        this.nombre = nombre;
        this.esExperto = esExperto;
        this.temasConocidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esExperto() {
        return esExperto;
    }

    public void agregarTemaConocido(String tema) {
        temasConocidos.add(tema);
    }

    public boolean puedeEvaluarTrabajo(Trabajo trabajo) {
        if (trabajo.EsPoster()) {
            return puedeEvaluarTrabajo(trabajo);
        } else {
            return temasConocidos.containsAll(trabajo.getPalabrasClave());
        }
    }
}
