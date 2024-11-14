package Poo3_2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    public Banco(){
        this.clientes = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void listarCuentasCliente(Cliente cliente){
        System.out.println("Cuentas de :" + cliente.getNombre() +" "+ cliente.getApellido());
        List<CajaDeAhorro> cuentas = cliente.listarCuentas();
        for (CajaDeAhorro cuenta : cuentas){
            System.out.println("Cuenta #" + cuenta.getNrodecuenta());
            System.out.println("Saldo $" + cuenta.consultarSaldo());
        }
    }
    public void cerrarCuenta(Cliente cliente, CajaDeAhorro cuenta){
        cliente.cerrarCuenta(cuenta);
    }
}
