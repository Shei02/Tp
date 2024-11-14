package poo2_2;

public class Electrodomestico {
    private String nombre;
    private float precio_Base = 100.0f;
    private String color = "gris plata";
    private float consumo = 10.0f;
    private float peso = 2.0f;

    public Electrodomestico() {
        this.nombre = nombre;
        this.precio_Base = precio_Base;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio_Base() {
        return precio_Base;
    }

    public String getColor() {
        return color;
    }

    public float getConsumo() {
        return consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio_Base(float precio_Base) {
        this.precio_Base = precio_Base;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        return consumo < 45;
    }

    public float balance(){
        return precio_Base/peso;
    }

    public boolean altaGama(){
        return balance() > 3;
    }
}
