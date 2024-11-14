package Poo3_2;

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Sheila","Artaza",29,43657400);
        CajaDeAhorro cuenta1 = new CajaDeAhorro(1001);
        CajaDeAhorro cuenta2 = new CajaDeAhorro(1002);

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);
        banco.agregarCliente(cliente1);

        cuenta1.depositar(1000);
        cuenta2.depositar(500);

        banco.listarCuentasCliente(cliente1);
        cuenta1.extraer(200);
        banco.listarCuentasCliente(cliente1);
        banco.cerrarCuenta(cliente1,cuenta2);
        banco.listarCuentasCliente(cliente1);
    }
}
