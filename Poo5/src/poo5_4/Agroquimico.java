package poo5_4;

import java.util.Set;

// Clase abstracta que representa un producto químico
class Agroquimico {
    private String nombre;
    private Set<String> cultivosNoRecomendados;
    private Set<String> estadosPatologicos;

    public Agroquimico(String nombre, Set<String> cultivosNoRecomendados, Set<String> estadosPatologicos) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = cultivosNoRecomendados;
        this.estadosPatologicos = estadosPatologicos;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean puedeTratarEnfermedad(Set<String> estadosEnfermedad) {
        return estadosPatologicos.containsAll(estadosEnfermedad);
    }

    public boolean esRecomendadoParaCultivo(String cultivo) {
        return !cultivosNoRecomendados.contains(cultivo);
    }
}