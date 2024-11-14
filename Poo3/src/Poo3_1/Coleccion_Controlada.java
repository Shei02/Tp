package Poo3_1;

import java.util.ArrayList;
import java.util.List;

public class Coleccion_Controlada<T> {
    private List<T> elementos;
    private int limite;

    public Coleccion_Controlada(int limite) {
        this.limite = limite;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        if (elementos.size() < limite) {
            elementos.add(elemento);
        } else {
            System.out.println("La colección ha alcanzado su límite. No se puede agregar más elementos.");
        }
    }

    public void eliminarElemento(T elemento) {
        if (elementos.contains(elemento)) {
            elementos.remove(elemento);
        } else {
            System.out.println("El elemento no se encuentra en la colección.");
        }
    }

    public int tamaño() {
        return elementos.size();
    }

    public void imprimirElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        Coleccion_Controlada<String> coleccion = new Coleccion_Controlada<>(3);

        coleccion.agregarElemento("Elemento 1");
        coleccion.agregarElemento("Elemento 2");
        coleccion.agregarElemento("Elemento 3");
        coleccion.agregarElemento("Elemento 4"); // Este elemento no se agregará debido al límite

        coleccion.imprimirElementos();

        coleccion.eliminarElemento("Elemento 2");
        coleccion.imprimirElementos();
    }
}