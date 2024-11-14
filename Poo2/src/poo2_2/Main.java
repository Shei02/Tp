package poo2_2;

public class Main {
    public static void main(String[] args){
        Electrodomestico pava_electrica = new Electrodomestico();
        System.out.println("el balance es: " + pava_electrica.balance());
        System.out.println("es alta gama? " + pava_electrica.altaGama());
    }
}
