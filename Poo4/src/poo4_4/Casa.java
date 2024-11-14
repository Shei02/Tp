package poo4_4;

import java.util.HashSet;
import java.util.Set;
import poo4_4.Alumno;

public class Casa {
    private String nombre;
    private Set<String> cualidadesRequeridas;
    private Set<String> familiares;
    private int capacidadMaxima;
    private int contador;
    private Casa enemiga;

    public Casa(String nombre, Set<String> cualidadesRequeridas, int capacidadMaxima, int contador) {
        this.nombre = nombre;
        this.cualidadesRequeridas = cualidadesRequeridas;
        this.familiares = new HashSet<>();
        this.capacidadMaxima = capacidadMaxima;
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getCualidadesRequeridas() {
        return cualidadesRequeridas;
    }

    public Set<String> getFamiliares() {
        return familiares;
    }

    public void agregarFamiliar(String nombreFamiliar) {
        familiares.add(nombreFamiliar);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Casa getEnemiga() {
        return enemiga;
    }

    public void setEnemiga(Casa enemiga) {
        this.enemiga = enemiga;
    }

    public boolean tieneFamiliar(String nombreFamiliar){
        return familiares.contains(nombreFamiliar);
    }

    public boolean puedeAceptarAlumno(Alumno alumno) {
        if (contador >= capacidadMaxima) {
            return false; // La casa está llena
        }
        if (familiares.isEmpty()) {
            return false; // La casa requiere familiares y no tiene ninguno.
        }
        if (enemiga != null && enemiga.tieneFamiliar(alumno.getNombre())) {
            return false; // La casa tiene enemistad con la casa del familiar del alumno.
        }
        return alumno.tieneCualidades(cualidadesRequeridas);
    }

    public void agregarAlumno() {
        contador++;
    }
}
