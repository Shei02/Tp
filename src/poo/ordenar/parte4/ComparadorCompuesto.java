package poo.ordenar.parte4;

import poo.ordenar.modelo.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparadorCompuesto implements Comparator<Persona> {
    private List<Comparator<Persona>> comparadores = new ArrayList<>();

    @Override
    public int compare(Persona o1, Persona o2) {
        for (Comparator<Persona> comp : comparadores) {
            int res = comp.compare(o1, o2);
            if (res != 0)
                return res;
        }
        return 0;
    }

    public void agregar(Comparator<Persona> comp) {
        comparadores.add(comp);
    }
}
