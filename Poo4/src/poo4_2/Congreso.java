package poo4_2;

import java.util.ArrayList;
import java.util.List;
import poo4_2.Evaluador;
import poo4_2.Trabajo;

public class Congreso {
    private List<Evaluador> evaluadores;
    private List<Trabajo> trabajos;

    public Congreso() {
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public void agregarEvaluador(Evaluador evaluador) {
        evaluadores.add(evaluador);
    }

    public void agregarTrabajo(Trabajo trabajo) {
        trabajos.add(trabajo);
    }

    public List<Evaluador> obtenerEvaluadoresParaTrabajo(Trabajo trabajo) {
        List<Evaluador> evaluadoresAptos = new ArrayList<>();
        for (Evaluador evaluador : evaluadores) {
            if (evaluador.puedeEvaluarTrabajo(trabajo)) {
                evaluadoresAptos.add(evaluador);
            }
        }
        return evaluadoresAptos;
    }

    public List<Trabajo> obtenerTrabajosParaEvaluador(Evaluador evaluador) {
        List<Trabajo> trabajosAsignables = new ArrayList<>();
        for (Trabajo trabajo : trabajos) {
            if (evaluador.puedeEvaluarTrabajo(trabajo)) {
                trabajosAsignables.add(trabajo);
            }
        }
        return trabajosAsignables;
    }

    public int contarTrabajosDeEvaluador(Evaluador evaluador) {
        int contador = 0;
        for (Trabajo trabajo : trabajos) {
            if (evaluador.puedeEvaluarTrabajo(trabajo)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean esExperto(Evaluador evaluador) {
        return evaluador.esExperto();
    }
}
