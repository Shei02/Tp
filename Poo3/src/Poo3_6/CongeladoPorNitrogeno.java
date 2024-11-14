package Poo3_6;

public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicionNitrogeno;

    public CongeladoPorNitrogeno(String fechaVencimiento, String nroLote, String codSupervision, String granjaOrigen, double tempMantenimiento, String metodoCongelacion, int tiempoExposicionNitrogeno) {
        super(fechaVencimiento, nroLote, codSupervision, granjaOrigen, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "\nMetodo de Congelacion: " + metodoCongelacion + "\nTiempo de exposicion al Nitrogeno: " + tiempoExposicionNitrogeno + "Segundos";
    }
}
