package poo.ordenar.parte1;

import poo.ordenar.modelo.Persona;
import poo.ordenar.utils.Datos;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // inicializo los datos
        List<Persona> personas = Datos.get();

        // ordeno por edad asc
        ordenar(personas, new ComparadorAscEdad());
        System.out.println("==========================================");
        System.out.println("Edad asc");
        System.out.println("==========================================");
        System.out.println(personas);

        // ordeno por edad des
        ordenar(personas, new ComparadorDesEdad());
        System.out.println("\n==========================================");
        System.out.println("Edad des");
        System.out.println("==========================================");
        System.out.println(personas);
    }

    // bubble-sort con comparator
    public static void ordenar(List<Persona> personas, Comparator<Persona> comp) {
        for (int i = 0; i < personas.size() - 1; i++) {
            for (int j = i + 1; j < personas.size(); j++) {
                Persona p1 = personas.get(i);
                Persona p2 = personas.get(j);
                if (comp.compare(p1, p2) > 0) {
//                if (p1.getEdad() > p2.getEdad()) {
                    personas.set(i, p2);
                    personas.set(j, p1);
                }
            }
        }
    }

}
