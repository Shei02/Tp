package poo5_4;

import java.util.Set;
import java.util.HashSet;
import poo5_4.Agroquimico;

// Clase que representa un cultivo
class Cultivo {
    private String nombre;
    private Set<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre, Set<Enfermedad> enfermedadesFrecuentes) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = enfermedadesFrecuentes;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Agroquimico> obtenerAgroquimicosParaEnfermedad(Enfermedad enfermedad) {
        Set<Agroquimico> agroquimicosParaEnfermedad = new HashSet<>();
        for (Agroquimico agroquimico : agroquimicosParaEnfermedad) {
            if (agroquimico.puedeTratarEnfermedad(enfermedad.getEstadosPatologicos()) &&
                    agroquimico.esRecomendadoParaCultivo(this.nombre)) {
                agroquimicosParaEnfermedad.add(agroquimico);
            }
        }
        return agroquimicosParaEnfermedad;
    }
}
