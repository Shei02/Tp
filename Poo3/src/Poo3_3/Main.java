package Poo3_3;

public class Main {
    public static void main(String[] args){
        //ejemplo de uso de la alarma
        Alarma alarma = new Alarma();
        alarma.setVidrioroto(true);
        alarma.comprobar(); //deberia hacer sonar el timbre

        //ejemplo de uso de la alarma luminosa
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();
        alarmaLuminosa.setMovdetectado(true);
        alarmaLuminosa.comprobar(); //deberia prender la loozz
    }
}
