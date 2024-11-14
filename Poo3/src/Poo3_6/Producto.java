package Poo3_6;

public class Producto {
    private String fechaVencimiento;
    private String nroLote;

    public Producto(String fechaVencimiento, String nroLote) {
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
    }
    //Metodo para obtener la etiqueta del producto
    public String obtenerEtiqueta(){
        return "Fecha de Vencimiento: " + fechaVencimiento + "\nNumero de lote: " + nroLote;
    }
}
