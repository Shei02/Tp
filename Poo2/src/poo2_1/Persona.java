package poo2_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Persona {
    private String nombre = "N";
    private String apellido = "N";
    private int edad;
    private final int dni;
    private String sexo = "Femenino";
    private float peso = 1.0f;
    private float altura = 1.0f;
    private Date fecha_nac = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");

    public Persona(int dni) throws ParseException{
        this.dni = dni;
        this.edad = edad();
    }

    public int getDni() {
        return dni;
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

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double masaCorporal() {
        return peso / Math.pow(altura, 2);
    }

    public boolean estaEnForma() {
        double Imc = this.masaCorporal();
        return Imc >= 18.5 && Imc <= 25;
    }

    public boolean cumpleanios() {
        int mesActual = new Date().getMonth();
        int mesNac = fecha_nac.getMonth();

        if (mesNac == mesActual) {
            int diaActual = new Date().getDay();
            int diaNac = fecha_nac.getDay();

            return diaNac == diaActual;
        }
        return false;
    }

    private int edad() {
        long tiempoNacimiento = fecha_nac.getTime();
        long tiempoActual = new Date().getTime();
        long diferencia = tiempoActual - tiempoNacimiento + 93600000;
//      Suma una diferencia de 26 horas


        Date periodo = new Date(diferencia);
        int edadCalculada = periodo.getYear() - 70;
        System.out.println(edadCalculada);
        return edadCalculada;
    }

    public boolean mayorEdad(){
        return edad() >= 18;
    }

    public boolean aptoVotar(){
        return edad() >= 16;
    }

    public boolean coincideEdad(){
        return edad() == edad;
    }

    public String mostrarDatos() {
        String data = "Nombre: " + nombre + "\n";
        data += "Apellido: " + apellido + "\n";
        data+= "Edad: " + edad + "\n";
        data+= "DNI: " + dni + "\n";
//        Formato fecha
        String fecha = DateFormat.getDateInstance(DateFormat.SHORT).format(fecha_nac);
        data+= "Fecha de nacimiento: " + fecha + "\n";
        data+= "Sexo: " + sexo + "\n";
        data+= "Peso: " + peso + "\n";
        data += "Altura: " + altura + "\n";
        return data;
    }

}
