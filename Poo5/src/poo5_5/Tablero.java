package poo5_5;

import java.util.List;
import java.util.ArrayList;

// Clase que representa un tablero del juego
class Tablero {
    private int puntajeMinimo;
    private List<Ficha> fichas;

    public Tablero(int puntajeMinimo, List<Ficha> fichas) {
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = fichas;
    }

    public List<Ficha> fichasConPoderDestruccionMayorA(int poderMinimo) {
        List<Ficha> result = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getPoderDestruccion() > poderMinimo) {
                result.add(ficha);
            }
        }
        return result;
    }

    public List<Ficha> fichasConEspacioMayorA(int espacioMinimo) {
        List<Ficha> result = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getEspacio() > espacioMinimo) {
                result.add(ficha);
            }
        }
        return result;
    }

    public List<Ficha> fichasConFortalezaMayorA(int fortalezaMinima) {
        List<Ficha> result = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getFortaleza() > fortalezaMinima) {
                result.add(ficha);
            }
        }
        return result;
    }

    public double calcularDificultad() {
        int sumaFortalezas = 0;
        int sumaPoderes = 0;

        for (Ficha ficha : fichas) {
            sumaFortalezas += ficha.getFortaleza();
            sumaPoderes += ficha.getPoderDestruccion();
        }

        return (double) sumaFortalezas / sumaPoderes;
    }
}
