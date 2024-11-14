package poo.ordenar.parte3;

import poo.ordenar.modelo.Persona;

import java.util.Collections;
import java.util.List;
import poo.ordenar.utils.Datos;

public class Main {

    public static void main(String[] args) {
        // inicializo los datos
        List<Persona> personas = new Datos().get();

        // ordenar edad asc -> nombre desc (Comparator como lista vinculada con siguiente)
        System.out.println("==========================================");
        System.out.println("Comparator con lista vinculada");
        System.out.println("==========================================");
        ComparadorAbstracto c2 = new ComparadorDesNombre(null);
        ComparadorAbstracto c1 = new ComparadorAscEdad(c2);

        Collections.sort(personas, c1);
        System.out.println(personas);
    }
}
