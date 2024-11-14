package poo5_9;

import java.util.List;
import java.util.ArrayList;

public class Factura {
    private List<FacturaItem> items;
    private double descuentoPagoContado;
    private double descuentoPremio;

    public Factura() {
        items = new ArrayList<>();
        descuentoPagoContado = 0.1; // 10% de descuento por pago contado
        descuentoPremio = 0.5; // 50% de descuento por premio
    }

    public void agregarItem(Producto producto, int cantidad) {
        items.add(new FacturaItem(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (FacturaItem item : items) {
            Producto producto = item.getProducto();
            double precioUnitario = producto.getPrecio();

            if (producto.isGravamenAlto()) {
                // Calcular impuestos para productos con gravamen alto
                double impuestosProvinciales = precioUnitario * 0.15 + (0.5); // $0.5 si es domingo
                double impuestosNacionales = precioUnitario * 0.1 + 0.5;
                precioUnitario += impuestosProvinciales + impuestosNacionales;
            } else {
                // Calcular impuestos para productos con gravamen bajo
                double impuestosProvinciales = precioUnitario * 0.1 + 0.1;
                double impuestosNacionales = precioUnitario * 0.05 + (0.25); // $0.25 si el año es par
                precioUnitario += impuestosProvinciales + impuestosNacionales;
            }

            if (producto.getNombre().equalsIgnoreCase("contado")) {
                total += precioUnitario * item.getCantidad() * (1 - descuentoPagoContado);
            } else if (producto.getNombre().equalsIgnoreCase("premio")) {
                total += precioUnitario * item.getCantidad() * (1 - descuentoPremio);
            } else {
                total += precioUnitario * item.getCantidad();
            }
        }
        return total;
    }
}
