package Poo3_2;
import java.util.ArrayList;
import java.util.List;
public class CajaDeAhorro {
    private int nrodecuenta;
    private double saldo;
    public CajaDeAhorro(int nrodecuenta){
        this.nrodecuenta = nrodecuenta;
        this.saldo = 0.0;
    }
    public void depositar (double monto) {
        saldo += monto;
    }
    public boolean extraer(double monto){
        if(saldo >= monto){
            saldo -= monto;
            return true;
        }
        return false;
    }
    public double  consultarSaldo(){
        return saldo;
    }
    public int getNrodecuenta(){
        return nrodecuenta;
    }
}
