package poo5_9;

public class Producto {
    private String nombre;
    private double precio;
    private boolean gravamenAlto;
    private int stock;
    private int stockMinimo;

    public Producto(String nombre, double precio, boolean gravamenAlto, int stockMinimo) {
        this.nombre = nombre;
        this.precio = precio;
        this.gravamenAlto = gravamenAlto;
        this.stock = 0;
        this.stockMinimo = stockMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isGravamenAlto() {
        return gravamenAlto;
    }

    public int getStock() {
        return stock;
    }

    public void aumentarStock(int cantidad) {
        stock += cantidad;
    }

    public void disminuirStock(int cantidad) {
        stock -= cantidad;
    }

    public boolean escasea() {
        return stock <= stockMinimo;
    }

    public boolean escasea120() {
        return stock >= stockMinimo * 1.2;
    }

    public boolean escasea90() {
        return stock <= stockMinimo * 0.9;
    }

    public boolean escasea140() {
        return stock >= stockMinimo * 1.4;
    }
}
