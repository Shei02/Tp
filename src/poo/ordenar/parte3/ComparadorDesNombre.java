package poo.ordenar.parte3;

import poo.ordenar.modelo.Persona;

import java.util.Comparator;

public class ComparadorDesNombre extends ComparadorAbstracto {

    public ComparadorDesNombre(Comparator<Persona> sig) {
        super(sig);
    }

    @Override
    public int comparar(Persona o1, Persona o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
}
