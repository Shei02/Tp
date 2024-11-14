package poo4_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Congreso congreso = new Congreso();

        Evaluador evaluador1 = new Evaluador("Evaluador1", true);
        evaluador1.agregarTemaConocido("algoritmos");
        evaluador1.agregarTemaConocido("lenguajes de programación");
        congreso.agregarEvaluador(evaluador1);

        Evaluador evaluador2 = new Evaluador("Evaluador2", false);
        evaluador2.agregarTemaConocido("visualización");
        congreso.agregarEvaluador(evaluador2);

        List<String> palabrasClave1 = new ArrayList<>();
        palabrasClave1.add("algoritmos");
        palabrasClave1.add("estructuras de datos");
        Trabajo trabajo1 = new Trabajo("Trabajo1", palabrasClave1);
        congreso.agregarTrabajo(trabajo1);

        List<String> palabrasClave2 = new ArrayList<>();
        palabrasClave2.add("visualización");
        palabrasClave2.add("redes de comunicación");
        Trabajo trabajo2 = new Trabajo("Trabajo2", palabrasClave2);
        congreso.agregarTrabajo(trabajo2);

        List<Evaluador> evaluadoresParaTrabajo1 = congreso.obtenerEvaluadoresParaTrabajo(trabajo1);
        System.out.println("Evaluadores aptos para Trabajo1:");
        for (Evaluador evaluador : evaluadoresParaTrabajo1) {
            System.out.println(evaluador.getNombre());
        }

        List<Trabajo> trabajosParaEvaluador2 = congreso.obtenerTrabajosParaEvaluador(evaluador2);
        System.out.println("\nTrabajos asignables a Evaluador2:");
        for (Trabajo trabajo : trabajosParaEvaluador2) {
            System.out.println(trabajo.getTitulo());
        }

        int cantidadTrabajosEvaluador1 = congreso.contarTrabajosDeEvaluador(evaluador1);
        System.out.println("\nCantidad de trabajos asignados a Evaluador1: " + cantidadTrabajosEvaluador1);

        boolean esExpertoEvaluador1 = congreso.esExperto(evaluador1);
        System.out.println("Evaluador1 es experto: " + esExpertoEvaluador1);
    }
}
