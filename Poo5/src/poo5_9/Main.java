package poo5_9;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        // Agregar productos al supermercado
        Producto producto1 = new Producto("Producto1", 10.0, true, 10);
        Producto producto2 = new Producto("Producto2", 5.0, false, 20);

        supermercado.agregarProducto(producto1);
        supermercado.agregarProducto(producto2);

        // Recibir una partida de productos
        Map<String, Integer> partidaProductos = new HashMap<>();
        partidaProductos.put("Producto1", 50);
        partidaProductos.put("Producto2", 30);

        supermercado.recibirPartidaProductos(partidaProductos);

        // Ejemplo de consultas
        List<Producto> productosEscasean = supermercado.productosEscasean();
        System.out.println("Productos que escasean en el stock:");
        for (Producto producto : productosEscasean) {
            System.out.println(producto.getNombre());
        }

        // Ejemplo de factura
        Factura factura = new Factura();
        factura.agregarItem(producto1, 5);
        factura.agregarItem(producto2, 10);

        double totalFactura = factura.calcularTotal();
        System.out.println("Total de la factura: $" + totalFactura);
    }
}