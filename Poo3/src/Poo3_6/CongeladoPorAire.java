package Poo3_6;

public class CongeladoPorAire extends ProductoCongelado{
    private double porcNitrogeno;
    private double porcOxigeno;
    private double porcDioxidoCarbono;
    private double porcVaporAgua;

    public CongeladoPorAire(String fechaVencimiento, String nroLote, String codSupervision, String granjaOrigen, double tempMantenimiento, double porcNitrogeno, double porcOxigeno, double porcDioxidoCarbono, double porcVaporAgua) {
        super(fechaVencimiento, nroLote, codSupervision, granjaOrigen, tempMantenimiento);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcDioxidoCarbono = porcDioxidoCarbono;
        this.porcVaporAgua = porcVaporAgua;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "\nMetodo de congelacion: Aire" + "\n% de nitrogeno: " + porcNitrogeno + "\n% de oxigeno: " + porcOxigeno + "\n% de dioxido de carbono: " + porcDioxidoCarbono + "\n% de vapor de agua: " + porcVaporAgua ;
    }
}
