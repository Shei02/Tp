package poo5_1;

public class Computadora implements Comparable<Computadora> {
    private String nombre;
    private int velocidad;

    public Computadora(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int compareTo(Computadora otraComputadora){
        //Ordenar las computadoras por velocidad de manera ascendente
        return Integer.compare(this.velocidad, otraComputadora.getVelocidad());
    }
}
