package poo.ordenar.parte3;

import poo.ordenar.modelo.Persona;

import java.util.Comparator;

public class ComparadorAscEdad extends ComparadorAbstracto {

    public ComparadorAscEdad(Comparator<Persona> sig) {
        super(sig);
    }

    @Override
    public int comparar(Persona o1, Persona o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
