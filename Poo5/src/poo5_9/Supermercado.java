package poo5_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import poo5_9.Producto;

public class Supermercado {
    private List<Producto> productos;
    private Map<String, Integer> stockProductos;

    public Supermercado() {
        productos = new ArrayList<>();
        stockProductos = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        stockProductos.put(producto.getNombre(), 0);
    }

    public void recibirPartidaProductos(Map<String, Integer> partidaProductos) {
        for (Map.Entry<String, Integer> entry : partidaProductos.entrySet()) {
            String nombreProducto = entry.getKey();
            int cantidad = entry.getValue();
            if (stockProductos.containsKey(nombreProducto)) {
                stockProductos.put(nombreProducto, stockProductos.get(nombreProducto) + cantidad);
            }
        }
    }

    public List<Producto> productosEscasean() {
        List<Producto> escasean = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.escasea() || producto.escasea120() || producto.escasea90() || producto.escasea140()) {
                escasean.add(producto);
            }
        }
        return escasean;
    }

    public double dineroFacturadoEnFecha(String fecha) {
        // Implementar la lógica para calcular el dinero facturado en una fecha dada
        // (debe considerar las facturas emitidas en esa fecha)
        return 0.0;
    }

    public double dineroFacturadoEnPeriodo(String fechaInicio, String fechaFin) {
        // Implementar la lógica para calcular el dinero facturado en un periodo determinado
        // (debe considerar las facturas emitidas en ese periodo)
        return 0.0;
    }

    public String productoMasRecaudadoEnFecha(String fecha) {
        // Implementar la lógica para determinar el producto que más recaudó en una fecha dada
        return null;
    }

    public String productoMasRecaudadoEnPeriodo(String fechaInicio, String fechaFin) {
        // Implementar la lógica para determinar el producto que más recaudó en un periodo determinado
        return null;
    }
}
