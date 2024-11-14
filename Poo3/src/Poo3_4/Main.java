package Poo3_4;

public class Main {
    public static void main(String[] args){
        AlarmaSensorial alarmaSensorial = new AlarmaSensorial();
        Sensor sensor1 = new Sensor("Cocina");
        Sensor sensor2 = new Sensor("Sala de estar");
        Sensor sensor3 = new Sensor("Pieza");

        alarmaSensorial.agregarSensor(sensor1);
        alarmaSensorial.agregarSensor(sensor2);
        alarmaSensorial.agregarSensor(sensor3);

        sensor1.activar();
        sensor3.activar();

        alarmaSensorial.comprobar();//deberia hacer sonar el timbre y mostrar las zonas en conflicto
    }
}
