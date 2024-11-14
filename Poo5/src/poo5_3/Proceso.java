package poo5_3;

// Clase para representar un proceso (computadora en el Centro de Cómputos)
class Proceso {
    private int id;
    private int requerimientoMemoria;

    public Proceso(int id, int requerimientoMemoria) {
        this.id = id;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public int getId() {
        return id;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }
}