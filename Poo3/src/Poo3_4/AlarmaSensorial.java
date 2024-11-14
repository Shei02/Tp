package Poo3_4;

import Poo3_3.Timbre;

import java.util.ArrayList;
import java.util.List;

class AlarmaSensorial {
    private List<Sensor> sensores;
    private Timbre timbre;
    public AlarmaSensorial(){
        this.sensores = new ArrayList<>();
        this.timbre = new Timbre();
    }
    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }
    public void comprobar(){
        boolean activada = false;
        List<String> zonasEnConflicto = new ArrayList<>();
        for (Sensor sensor : sensores){
            if(sensor.estaActivado()){
                activada=true;
                zonasEnConflicto.add(sensor.getZona());
            }
        }
        if(activada){
            timbre.hacerSonar();
            System.out.println("Alarma activada en zonas: " + String.join(",",zonasEnConflicto));
        }
    }
}
