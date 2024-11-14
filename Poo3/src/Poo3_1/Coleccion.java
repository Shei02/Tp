package Poo3_1;

import java.util.ArrayList;
import java.util.List;

public class Coleccion<T> {
    private List<T> elementos = new ArrayList();

    public Coleccion() {
    }

    public void agregar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obtener(int indice) {
        if (indice >= 0 && indice < this.elementos.size()) {
            return this.elementos.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    public int tamaño() {
        return this.elementos.size();
    }

    public boolean estaVacia() {
        return this.elementos.isEmpty();
    }

    public void limpiar() {
        this.elementos.clear();
    }

    public String toString() {
        return this.elementos.toString();
    }
}