package poo5_5;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear fichas
        Ficha chocolate = new Ficha("Chocolate", 1, 1, 0);
        Ficha piedra = new Ficha("Piedra", 6, 1, 0);
        Ficha carameloRayas = new Ficha("Caramelo a Rayas", 1, 1, 10);
        Ficha torta = new Ficha("Torta", 8, 4, 4);

        List<Ficha> fichas = new ArrayList<>();
        fichas.add(chocolate);
        fichas.add(piedra);
        fichas.add(carameloRayas);
        fichas.add(torta);

        // Crear tablero
        Tablero tablero = new Tablero(100, fichas);

        // Buscar fichas según los criterios mencionados
        List<Ficha> fichasConPoderMayorA2 = tablero.fichasConPoderDestruccionMayorA(2);
        List<Ficha> fichasConEspacioMayorA4 = tablero.fichasConEspacioMayorA(4);
        List<Ficha> fichasConFortalezaMayorA5 = tablero.fichasConFortalezaMayorA(5);

        // Combinaciones lógicas de los anteriores
        List<Ficha> combinacion1 = new ArrayList<>(fichasConPoderMayorA2);
        combinacion1.retainAll(fichasConEspacioMayorA4);

        List<Ficha> combinacion2 = new ArrayList<>(fichasConPoderMayorA2);
        combinacion2.retainAll(fichasConFortalezaMayorA5);

        List<Ficha> combinacion3 = new ArrayList<>(fichasConEspacioMayorA4);
        combinacion3.retainAll(fichasConFortalezaMayorA5);

        System.out.println("Fichas con poder de destrucción mayor a 2: " + fichasConPoderMayorA2);
        System.out.println("Fichas que ocupan más de 4 lugares: " + fichasConEspacioMayorA4);
        System.out.println("Fichas con fortaleza mayor a 5: " + fichasConFortalezaMayorA5);
        System.out.println("Combinación 1 (Poder > 2 y Espacio > 4): " + combinacion1);
        System.out.println("Combinación 2 (Poder > 2 y Fortaleza > 5): " + combinacion2);
        System.out.println("Combinación 3 (Espacio > 4 y Fortaleza > 5): " + combinacion3);

        // Calcular dificultad del tablero
        double dificultad = tablero.calcularDificultad();
        System.out.println("Dificultad del tablero: " + dificultad);
    }
}
