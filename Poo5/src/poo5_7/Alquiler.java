package poo5_7;

public class Alquiler {
    private String fecha;
    private int IdCancha;
    private double precio;

    public Alquiler(String fecha, int idCancha, double precio) {
        this.fecha = fecha;
        IdCancha = idCancha;
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdCancha() {
        return IdCancha;
    }

    public double getPrecio() {
        return precio;
    }
}
