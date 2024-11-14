package poo5_3;

// Clase para representar un recurso (computadora o barco)
class Recurso {
    private int id;
    private int velocidad; // Para Centro de Cómputos, velocidad de la computadora; para Puerto de Cereales, capacidad del barco.

    public Recurso(int id, int velocidad) {
        this.id = id;
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
