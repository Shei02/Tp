package poo5_2;

import java.util.Date;
public class Camion {
    private String nombre;
    private Date fechaCarga;

    public Camion(String nombre, Date fechaCarga) {
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }
}
