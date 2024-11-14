package Poo3_6;

public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String granjaOrigen;

    public ProductoFresco(String fechaVencimiento, String nroLote, String fechaEnvasado, String granjaOrigen) {
        super(fechaVencimiento, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String obtenerEtiqueta() {
        return super.obtenerEtiqueta() + "\nFecha de Envasado: " + fechaEnvasado + "\nGranga de origen: " + granjaOrigen;
    }
}
