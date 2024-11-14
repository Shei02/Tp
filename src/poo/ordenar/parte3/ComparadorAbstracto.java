package poo.ordenar.parte3;

import poo.ordenar.modelo.Persona;

import java.util.Comparator;

public abstract class ComparadorAbstracto implements Comparator<Persona> {
    private Comparator<Persona> sig;

    public ComparadorAbstracto(Comparator<Persona> sig) {
        this.sig = sig;
    }

    @Override
    public int compare(Persona o1, Persona o2) {
        int res = comparar(o1, o2);
        if (res == 0 && sig != null)
            res = sig.compare(o1, o2);
        return res;
    }

    public abstract int comparar(Persona o1, Persona o2);
}
