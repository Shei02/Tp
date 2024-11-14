package poo.ordenar.parte1;

import poo.ordenar.modelo.Persona;

import java.util.Comparator;

public class ComparadorDesEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.getEdad() - p1.getEdad();
    }
}
