package poo4_2;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    private String titulo;
    private List<String> palabrasClave;
    private boolean esPoster;

    public Trabajo(String titulo, List<String> palabrasClave) {
        this.titulo = titulo;
        this.palabrasClave = palabrasClave;
        this.esPoster = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setEsPoster(boolean esPoster) {
        this.esPoster = esPoster;
    }

    public boolean EsPoster(){
        return esPoster;
    }
}
