package poo5_5;

// Clase que representa una ficha del tablero
class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacio;
    private int poderDestruccion;

    public Ficha(String nombre, int fortaleza, int espacio, int poderDestruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDestruccion = poderDestruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }
}