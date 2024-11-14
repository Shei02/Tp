package Poo3_4;

public class Sensor {
    private String zona;
    private boolean activado;
    public Sensor(String zona){
        this.zona = zona;
        this.activado = false;
    }
    public void activar(){
        this.activado = true;
    }
    public void desactivar(){
        this.activado = false;
    }
    public boolean estaActivado(){
        return this.activado;
    }
    public String getZona(){
        return this.zona;
    }
}
