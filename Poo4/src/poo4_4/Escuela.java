package poo4_4;

import java.util.HashSet;
import java.util.Set;
import poo4_4.Alumno;
import poo4_4.Casa;

public class Escuela {
    private Set<Casa> casas;

    public Escuela() {
        casas = new HashSet<>();
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public Casa asignarAlumno(Alumno alumno) {
        for (Casa casa : casas) {
            if (casa.puedeAceptarAlumno(alumno)) {
                return casa;
            }
        }
        return null; // Ninguna casa pudo aceptar al alumno.
    }
}
