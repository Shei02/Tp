package Poo3_2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private List<CajaDeAhorro> cuentas;

    public Cliente(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 27;
        this.dni = dni;
        this.cuentas = new ArrayList<>();
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

    public int getDni() {
        return dni;
    }

    public List<CajaDeAhorro> getCuentas() {
        return cuentas;
    }

    public void agregarCuenta(CajaDeAhorro cuenta){
        cuentas.add(cuenta);
    }
    public List<CajaDeAhorro> listarCuentas(){
        return cuentas;
    }
    public void cerrarCuenta(CajaDeAhorro cuenta){
        cuentas.remove(cuenta);
    }
}
