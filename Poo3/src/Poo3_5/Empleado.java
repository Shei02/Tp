package Poo3_5;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private int tel;
    private double salarioSemanal;

    public Empleado(String nombre, String apellido, int edad, int tel, double salarioSemanal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tel = tel;
        this.salarioSemanal = salarioSemanal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getTel() {
        return tel;
    }
    public double calcularPagoSemanal(){
        return salarioSemanal;
    }
}
