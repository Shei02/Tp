package Poo3_6;

public class CongeladoPorAgua extends ProductoCongelado{
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaVencimiento, String nroLote, String codSupervision, String granjaOrigen, double tempMantenimiento, double salinidadAgua) {
        super(fechaVencimiento, nroLote, codSupervision, granjaOrigen, tempMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "\nMetodo de congelacion: Agua" + "\nSalinidad del agua: " + salinidadAgua + "g/L";
    }
}
