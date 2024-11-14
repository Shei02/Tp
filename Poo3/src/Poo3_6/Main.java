package Poo3_6;

public class Main {
    public static void main (String[] args){
        Producto producto1 = new ProductoFresco("2023-09-15", "Lote123","2023-09-10","Granja A");
        Producto producto2 = new ProductoRefrigerado("2023-09-20", "Lote456", "Sup123", "2023-09-15", 4.0, "Granja B");
        Producto producto3 = new CongeladoPorAire("2023-09-25", "Lote789", "Sup456", "Granja C", -18.0,80,15,5,0);
        Producto producto4 = new CongeladoPorAgua("2023-09-30", "Lote101", "Sup789", "Granja D", -20.0,10);
        Producto producto5 = new CongeladoPorNitrogeno("2023-10-05", "Lote123", "Sup101", "Granja E", -25.0, "N2",120);

        System.out.println("Producto 1:\n" + producto1.obtenerEtiqueta());
        System.out.println("\nProducto 2:\n" + producto2.obtenerEtiqueta());
        System.out.println("\nProducto 3:\n" + producto3.obtenerEtiqueta());
        System.out.println("\nProducto 4:\n" + producto4.obtenerEtiqueta());
        System.out.println("\nProducto 5:\n" + producto5.obtenerEtiqueta());
    }
}

