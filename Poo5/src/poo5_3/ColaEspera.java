package poo5_3;

import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

// Clase para representar una cola de espera de procesos o recursos
class ColaEspera<T> {
    private Queue<T> cola;
    private Comparator<T> comparator;

    public ColaEspera(Comparator<T> comparator) {
        this.cola = new LinkedList<>();
        this.comparator = comparator;
    }

    public void agregar(T elemento) {
        cola.offer(elemento);
        ordenarCola();
    }

    public T atender() {
        return cola.poll();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    private void ordenarCola() {
        List<T> lista = new ArrayList<>(cola);
        lista.sort(comparator);
        cola.clear();
        cola.addAll(lista);
    }
}
