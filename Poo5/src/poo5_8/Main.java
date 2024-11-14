package poo5_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        // Agregar películas al catálogo
        Pelicula pelicula1 = new Pelicula("La Luna", "Una película sobre la luna", List.of("ciencia ficción"), "Director1",
                List.of("Actor1", "Actor2"), 2010, 110, 12);
        Pelicula pelicula2 = new Pelicula("Luna Roja", "Una película de terror en la luna", List.of("terror"), "Director2",
                List.of("Actor3", "Actor4"), 2020, 90, 16);

        plataforma.agregarPelicula(pelicula1);
        plataforma.agregarPelicula(pelicula2);

        // Ejemplo de búsqueda por título
        List<Pelicula> resultadosTitulo = plataforma.buscarPorTitulo("luna");
        System.out.println("Resultados de búsqueda por título:");
        for (Pelicula pelicula : resultadosTitulo) {
            System.out.println(pelicula);
        }

        // Ejemplo de búsqueda por género
        List<Pelicula> resultadosGenero = plataforma.buscarPorGenero("terror");
        System.out.println("\nResultados de búsqueda por género:");
        for (Pelicula pelicula : resultadosGenero) {
            System.out.println(pelicula);
        }

        // Ejemplo de búsqueda por actor y director
        List<Pelicula> resultadosActorDirector = plataforma.buscarPorActorDirector("Actor1", "Director1");
        System.out.println("\nResultados de búsqueda por actor y director:");
        for (Pelicula pelicula : resultadosActorDirector) {
            System.out.println(pelicula);
        }

        // Ejemplo de búsqueda por año y duración
        List<Pelicula> resultadosAnioDuracion = plataforma.buscarPorAnioDuracion(2015, 95);
        System.out.println("\nResultados de búsqueda por año y duración:");
        for (Pelicula pelicula : resultadosAnioDuracion) {
            System.out.println(pelicula);
        }
    }
}
