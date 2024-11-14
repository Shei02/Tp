package poo.ordenar.parte2;

import java.util.Comparator;

public class ComparadorCiudad implements Comparator<String> {
    private int numero;

    public ComparadorCiudad(int numero){
        this.numero = numero;
    }

    @Override
    public int compare(String s1, String s2) {
        return numero*s1.compareTo(s2);
    }
}
