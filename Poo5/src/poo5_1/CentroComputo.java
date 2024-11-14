package poo5_1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class CentroComputo {
    private Queue<Proceso> colaEspera = new PriorityQueue<>(Comparator.comparingInt(Proceso::getRequerimientoMemoria));
    private PriorityQueue<Computadora> colaComputadoras = new PriorityQueue<>();

    public void aggProceso(Proceso p){
        colaEspera.add(p);
    }

    public void aggComputadora(Computadora c){
        colaComputadoras.add(c);
    }

    public void ejecutarProcesos(){
        while (!colaEspera.isEmpty() && !colaComputadoras.isEmpty()){
            Proceso proceso = colaEspera.poll();
            Computadora computadora = colaComputadoras.poll();
            System.out.println("Ejecutando proceso: " + proceso.getNombre() + " en computadora " + computadora.getNombre() + "");
        }
    }
}
