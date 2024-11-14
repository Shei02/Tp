package Poo3_6;

public class ProductoCongelado extends Producto{
    private String codSupervision;
    private String granjaOrigen;
    private double tempMantenimiento;

    public ProductoCongelado(String fechaVencimiento, String nroLote, String codSupervision, String granjaOrigen, double tempMantenimiento) {
        super(fechaVencimiento, nroLote);
        this.codSupervision = codSupervision;
        this.granjaOrigen = granjaOrigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "\nCodigo de supervision: " + codSupervision + "\nGranja origen: " + granjaOrigen + "\nTemperatura de mantenimiento: " + tempMantenimiento + "°C";
    }
}
