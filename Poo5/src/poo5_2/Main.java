package poo5_2;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        PuertoCereales puerto = new PuertoCereales();

        puerto.aggBarco(new Barco("Barco1",5000));
        puerto.aggBarco(new Barco("Barco2",8000));
        puerto.aggBarco(new Barco("Barco3",6000));

        puerto.aggCamiones(new Camion("Camion1", new Date()));
        puerto.aggCamiones(new Camion("Camion2", new Date()));
        puerto.aggCamiones(new Camion("Camion3", new Date()));

        puerto.cargaBarcos();
    }
}
