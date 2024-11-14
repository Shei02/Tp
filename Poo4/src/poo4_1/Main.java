package poo4_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lotes
        List<String> mineralesLote1 = new ArrayList<>();
        mineralesLote1.add("Nitrógeno");
        mineralesLote1.add("Fósforo");
        Lote lote1 = new Lote(1, 60.0, mineralesLote1, true);

        List<String> mineralesLote2 = new ArrayList<>();
        mineralesLote2.add("Fósforo");
        Lote lote2 = new Lote(2, 45.0, mineralesLote2, false);

        // Crear cereales
        List<String> mineralesCereal1 = new ArrayList<>();
        mineralesCereal1.add("Nitrógeno");
        mineralesCereal1.add("Fósforo");
        Cereal cereal1 = new Cereal("Trigo", mineralesCereal1, "Granos de cosecha fina");

        List<String> mineralesCereal2 = new ArrayList<>();
        mineralesCereal2.add("Fósforo");
        Cereal cereal2 = new Cereal("Maíz", mineralesCereal2, "Granos de cosecha gruesa");

        // Crear cooperativa
        Cooperativa cooperativa = new Cooperativa();
        cooperativa.agregarLote(lote1);
        cooperativa.agregarLote(lote2);
        cooperativa.agregarCereal(cereal1);
        cooperativa.agregarCereal(cereal2);

        // Consultar siembra de cereales en lotes
        System.out.println("Lotes adecuados para sembrar Trigo:");
        List<Lote> lotesParaTrigo = cooperativa.listarLotesParaCereal(cereal1);
        for (Lote lote : lotesParaTrigo) {
            System.out.println("Lote " + lote.getId());
        }

        System.out.println("\nLotes adecuados para sembrar Maíz:");
        List<Lote> lotesParaMaiz = cooperativa.listarLotesParaCereal(cereal2);
        for (Lote lote : lotesParaMaiz) {
            System.out.println("Lote " + lote.getId());
        }

        // Consultar si un lote es común o especial
        System.out.println("\nEl Lote 1 es especial: " + cooperativa.esLoteEspecial(lote1));
        System.out.println("El Lote 2 es especial: " + cooperativa.esLoteEspecial(lote2));
    }
}