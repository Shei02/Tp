package Poo3_6;

public class ProductoRefrigerado extends Producto{
    private String codSupervision;
    private String fechaEnvasado;
    private double tempMantenimiento;
    private String granjaOrigen;

    public ProductoRefrigerado(String fechaVencimiento, String nroLote, String codSupervision, String fechaEnvasado, double tempMantenimiento, String granjaOrigen) {
        super(fechaVencimiento, nroLote);
        this.codSupervision = codSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMantenimiento = tempMantenimiento;
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "El codigo de supervision es: " + codSupervision + "\nFecha de envasado: " + fechaEnvasado + "\nTemperatura de mantenimeinto: " + tempMantenimiento + "°C\nGranja de origen: " + granjaOrigen;
    }
}
