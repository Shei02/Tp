package poo.ordenar.parte4;

import poo.ordenar.modelo.Persona;

import java.util.Comparator;

public class ComparadorDesNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
}
