package Poo3_3;
class AlarmaLuminosa extends Alarma{
    private Luz luz;
    public AlarmaLuminosa(){
        super(); //llama al constructor de la clase base que es Alarma
        this.luz = new Luz();
    }

    @Override
    public void comprobar() {
        super.comprobar();
        luz.encender();
    }
}
