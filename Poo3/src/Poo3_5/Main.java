package Poo3_5;

public class Main {
    public static void main(String[] args){
        EmpleadoContratado empleado1 = new EmpleadoContratado("Facundo", "Paredes", 28, 23158790, 200000);
        EmpleadoHorasExtra empleado2 = new EmpleadoHorasExtra("Sheila", "Artaza", 21, 6372782, 85000, 2000);
        EmpleadoComision empleado3 = new EmpleadoComision("Sol", "solcito", 67, 78237569, 90500,50.0);

        empleado2.registrarHorasExtras(5);
        empleado3.registrarVentas(1000.0);

        System.out.println("Pago semanal para " + empleado1.getNombre() + ":$" + empleado1.calcularPagoSemanal());
        System.out.println("Pago semanal para " + empleado2.getNombre() + ":$" + empleado2.calcularPagoSemanal());
        System.out.println("Pago semanal para " + empleado3.getNombre() + ":$" + empleado3.calcularPagoSemanal());
    }
}
