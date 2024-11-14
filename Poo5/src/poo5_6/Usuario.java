package poo5_6;

import java.util.List;
import java.util.ArrayList;

class Usuario {
    private String nombre;
    private List<String> preferencias;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.preferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPreferencia(String preferencia) {
        preferencias.add(preferencia);
    }

    public List<String> getPreferencias() {
        return preferencias;
    }
}
