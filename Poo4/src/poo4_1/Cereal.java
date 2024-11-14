package poo4_1;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private String nombre;
    private List<String> mineralesRequeridos;
    private String tipo;

    public Cereal(String nombre, List<String> mineralesRequeridos, String tipo) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public List<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }
}
