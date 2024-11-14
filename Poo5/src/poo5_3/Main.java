package poo5_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso para el Centro de Cómputos
        ColaEspera<Proceso> colaProcesos = new ColaEspera<>(Comparator.comparing(Proceso::getRequerimientoMemoria));
        List<Recurso> recursosDisponibles = new ArrayList<>();

        // Agregar procesos a la cola
        colaProcesos.agregar(new Proceso(1, 4));
        colaProcesos.agregar(new Proceso(2, 8));
        colaProcesos.agregar(new Proceso(3, 2));

        // Agregar recursos disponibles (computadoras)
        recursosDisponibles.add(new Recurso(101, 16));
        recursosDisponibles.add(new Recurso(102, 8));
        recursosDisponibles.add(new Recurso(103, 32));

        // Atender procesos en orden de prioridad
        while (!colaProcesos.isEmpty() && !recursosDisponibles.isEmpty()) {
            Proceso proceso = colaProcesos.atender();
            Recurso recurso = recursosDisponibles.get(0);
            recursosDisponibles.remove(0);
            System.out.println("Proceso " + proceso.getId() + " atendido por recurso " + recurso.getId());
        }
    }
}
