package poo5_2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PuertoCereales {
    private Queue<Barco> colaBarcos = new PriorityQueue<>(Comparator.comparingInt(Barco::getCapacidad).reversed());
    private Queue<Camion> colaCamiones = new LinkedList<>();

    public void aggBarco(Barco b){
        colaBarcos.add(b);
    }

    public void aggCamiones(Camion c){
        colaCamiones.add(c);
    }

    public void cargaBarcos(){
        while (!colaBarcos.isEmpty() && !colaCamiones.isEmpty()){
            Barco barco = colaBarcos.poll();
            Camion camion = colaCamiones.poll();
            System.out.println("Cargando el barco: " + barco.getNombre() + " con capacidad: " + barco.getCapacidad() + " desde el camion: " + camion.getNombre() + " cargado en la fecha: " + camion.getFechaCarga());
        }
    }
}
