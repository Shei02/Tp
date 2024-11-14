package poo5_1;

public class Proceso {
    private String nombre;
    private int requerimientoMemoria;

    public Proceso(String nombre, int requerimientoMemoria) {
        this.nombre = nombre;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }
}
