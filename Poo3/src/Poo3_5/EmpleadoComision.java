package Poo3_5;
import Poo3_5.Empleado;
class EmpleadoComision extends Empleado{
    private double porcentajeComision;
    private double ventasRealizadas;

    public EmpleadoComision(String nombre, String apellido, int edad, int tel, double salarioSemanal, double porcentajeComision) {
        super(nombre, apellido, edad, tel, salarioSemanal);
        this.porcentajeComision = porcentajeComision;
    }
    public void registrarVentas(double ventas){
        ventasRealizadas+= ventas;
    }

    @Override
    public double calcularPagoSemanal() {
        return super.calcularPagoSemanal() + (porcentajeComision * ventasRealizadas);
    }
}
