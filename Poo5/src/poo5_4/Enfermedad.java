package poo5_4;

import java.util.Set;

// Clase abstracta que representa una enfermedad
class Enfermedad {
    private String nombre;
    private Set<String> estadosPatologicos;

    public Enfermedad(String nombre, Set<String> estadosPatologicos) {
        this.nombre = nombre;
        this.estadosPatologicos = estadosPatologicos;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }
}
