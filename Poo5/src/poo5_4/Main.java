package poo5_4;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class Main {
    // Lista de agroquímicos disponibles
    private static List<Agroquimico> agroquimicos = new ArrayList<>();

    public static void main(String[] args) {
        // Crear agroquímicos
        Agroquimico agroquimico1 = new Agroquimico("Agroquimico1",
                new HashSet<>(Arrays.asList("girasol", "lino")),
                new HashSet<>(Arrays.asList("hojas amarillas", "caída prematura de frutos")));

        Agroquimico agroquimico2 = new Agroquimico("Agroquimico2",
                new HashSet<>(Arrays.asList("maíz")),
                new HashSet<>(Arrays.asList("hojas mordidas")));

        agroquimicos.add(agroquimico1);
        agroquimicos.add(agroquimico2);

        // Crear enfermedades
        Enfermedad enfermedad1 = new Enfermedad("Cochinilla",
                new HashSet<>(Arrays.asList("deshidratación", "hojas amarillas")));

        // Crear cultivos
        Cultivo cultivo1 = new Cultivo("girasol",
                new HashSet<>(Arrays.asList(enfermedad1)));

        Cultivo cultivo2 = new Cultivo("maíz",
                new HashSet<>(Arrays.asList(enfermedad1)));

        // Obtener agroquímicos para una enfermedad en un cultivo
        System.out.println("Agroquímicos para tratar la enfermedad '" + enfermedad1.getNombre() + "' en el cultivo 'girasol':");
        Set<Agroquimico> agroquimicosParaEnfermedadEnCultivo = cultivo1.obtenerAgroquimicosParaEnfermedad(enfermedad1);
        for (Agroquimico agroquimico : agroquimicosParaEnfermedadEnCultivo) {
            System.out.println(agroquimico.getNombre());
        }
    }
}
