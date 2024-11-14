package poo4_3;

import java.util.LinkedList; //lista con punteros
import java.util.NoSuchElementException; //sin excepsion de elementos

public class Main {
    public static void main (String[] args){
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        // Mostrar el tope de la pila sin eliminarlo
        System.out.println("Tope de la pila: " + pila.top());

        // Retirar elementos de la pila
        System.out.println("Pop: " + pila.pop());
        System.out.println("Pop: " + pila.pop());

        // Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

        // Crear una copia de la pila
        Pila<Integer> copia = pila.copy();
        System.out.println("Copia de la pila: " + copia.pop());

        // Crear una pila con elementos en orden inverso
        Pila<Integer> pilaInversa = pila.reverse();
        System.out.println("Pila en orden inverso: " + pilaInversa.pop());
    }
}
