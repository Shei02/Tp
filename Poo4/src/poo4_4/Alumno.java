package poo4_4;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private Set<String> cualidades;
    private String familiar;

    public Alumno(String nombre, Set<String> cualidades, String familiar) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.familiar = familiar;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getCualidades() {
        return cualidades;
    }

    public String getFamiliar() {
        return familiar;
    }

    public boolean tieneCualidades(Set<String> cualidadesRequeridas) {
        return cualidades.containsAll(cualidadesRequeridas);
    }
}
