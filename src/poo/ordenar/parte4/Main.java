package poo.ordenar.parte4;

import poo.ordenar.modelo.Persona;
import poo.ordenar.parte1.ComparadorAscEdad;
import poo.ordenar.utils.Datos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // inicializo los datos
        List<Persona> personas = new Datos().get();

        // ordernar edad asc -> nombre desc (Comparator compuesto)
        System.out.println("==========================================");
        System.out.println("Comparator compuesto");
        System.out.println("==========================================");
        Comparator<Persona> c2 = new ComparadorDesNombre();
        Comparator<Persona> c1 = new ComparadorAscEdad();
        ComparadorCompuesto cc = new ComparadorCompuesto();
        cc.agregar(c1);
        cc.agregar(c2);

        Collections.sort(personas, cc);
        System.out.println(personas);
    }
}
