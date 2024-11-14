package poo.ordenar.parte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import poo.ordenar.modelo.Persona;
import poo.ordenar.parte1.ComparadorAscEdad;
import poo.ordenar.utils.Datos;

public class Main {

    public static void main(String[] args) {
        // Comparable: String, Integer, Float, etc son Comparable
        Comparable ciudad1 = "Olavarria";
        Comparable ciudad2 = "Tandil";
        System.out.println("==========================================");
        System.out.println("Comparable: compareTo");
        System.out.println("==========================================");
        System.out.println(ciudad1.compareTo(ciudad2));

        // Collections.sort con Comparable - Persona implementa Comparable
        System.out.println("\n==========================================");
        System.out.println("Persona con Comparable");
        System.out.println("==========================================");
        List<Persona> personas = Datos.get();
        Collections.sort(personas);
        System.out.println(personas);

        // Collections.sort con Comparator
        System.out.println("\n==========================================");
        System.out.println("Persona con Comparator");
        System.out.println("==========================================");
        Collections.sort(personas, new ComparadorAscEdad());
        System.out.println(personas);

        // Collections.sort con Comparable - String es Comparable
        System.out.println("\n==========================================");
        System.out.println("String con Comparable");
        System.out.println("==========================================");
        List<String> ciudades = new ArrayList<>(Arrays.asList("Tandil", "Olavarria", "Azul"));
        Collections.sort(ciudades);
        System.out.println(ciudades);

        // Collections.sort con Comparator Asc/Des generico
        System.out.println("\n==========================================");
        System.out.println("String con Comparator");
        System.out.println("==========================================");
        Collections.sort(ciudades, new ComparadorCiudad(-1));
        System.out.println(ciudades);
    }

}
