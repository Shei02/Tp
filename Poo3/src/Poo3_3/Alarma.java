package Poo3_3;

class Alarma {
    private boolean vidrioroto;
    private boolean puertaventanaabierta;
    private boolean movdetectado;
    private Timbre timbre;

    public Alarma() {
        this.vidrioroto =false;
        this.puertaventanaabierta = false;
        this.movdetectado = false;
        this.timbre = new Timbre();
    }

    public void setVidrioroto(boolean vidrioroto) {
        this.vidrioroto = vidrioroto;
    }

    public void setPuertaventanaabierta(boolean puertaventanaabierta) {
        this.puertaventanaabierta = puertaventanaabierta;
    }

    public void setMovdetectado(boolean movdetectado) {
        this.movdetectado = movdetectado;
    }
    public void comprobar(){
        if (vidrioroto || puertaventanaabierta || movdetectado){
            timbre.hacerSonar();
        }
    }
}
