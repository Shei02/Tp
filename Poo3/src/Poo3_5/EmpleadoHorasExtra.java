package Poo3_5;
import Poo3_5.Empleado;
class EmpleadoHorasExtra extends Empleado{
    private double montoPorHoraExtra;
    private int horasExtrasTrabajadas;

    public EmpleadoHorasExtra (String nombre, String apellido, int edad, int tel, double salarioSemanal, double montoPorHoraExtra){
        super(nombre, apellido, edad, tel, salarioSemanal);
        this.montoPorHoraExtra = montoPorHoraExtra;
    }
    public void registrarHorasExtras(int horas){
        horasExtrasTrabajadas += horas;
    }

    @Override
    public double calcularPagoSemanal() {
        return super.calcularPagoSemanal() +(montoPorHoraExtra * horasExtrasTrabajadas);
    }
}
