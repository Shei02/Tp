package poo5_7;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private List<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPaga = cuotaPaga;
        this.alquileres = new ArrayList<>();
    }

    public void registrarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public int getEdad() {
        return edad;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
