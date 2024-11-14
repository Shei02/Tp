package poo.ordenar.utils;

import poo.ordenar.modelo.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Datos {

    public static List<Persona> get() {
        // inicializo los datos
        List<Persona> personas = Arrays.asList(
                new Persona("ana", 30),
                new Persona("ana", 25),
                new Persona("maria", 31),
                new Persona("juan", 22),
                new Persona("jose", 35),
                new Persona("jose", 22)
                );

        // mezclo
        Collections.shuffle(personas);

        // retorno los datos
        return new ArrayList<>(personas);
    }
}
