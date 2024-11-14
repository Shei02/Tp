package poo4_3;

import java.util.LinkedList; //lista con punteros
import java.util.NoSuchElementException; //sin excepsion de elementos

public class Pila<T> {
    private LinkedList<T> elementos;

    public Pila() {
        elementos = new LinkedList<>();
    }

    // Agregar un elemento a la pila
    public void push(T elemento) {
        elementos.addLast(elemento);
    }

    // Retirar y obtener el último elemento agregado
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return elementos.removeLast();
    }

    // Consultar el tope de la pila sin eliminarlo
    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return elementos.getLast();
    }

    // Obtener la cantidad de elementos almacenados
    public int size() {
        return elementos.size();
    }

    // Crear y retornar una nueva pila con una copia de los elementos en el mismo orden
    public Pila<T> copy() {
        Pila<T> copiaPila = new Pila<>();
        for (T elemento : elementos) {
            copiaPila.push(elemento);
        }
        return copiaPila;
    }

    // Crear y retornar una nueva pila con los elementos en orden inverso
    public Pila<T> reverse() {
        Pila<T> pilaInversa = new Pila<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            pilaInversa.push(elementos.get(i));
        }
        return pilaInversa;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}