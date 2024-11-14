package poo5_8;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Pelicula> catalogo;

    public Plataforma() {
        catalogo = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        catalogo.add(pelicula);
    }

    public List<Pelicula> buscarPorTitulo(String palabraClave) {
        List<Pelicula> resultados = new ArrayList<>();
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getTitulo().toLowerCase().contains(palabraClave.toLowerCase())) {
                resultados.add(pelicula);
            }
        }
        return resultados;
    }

    public List<Pelicula> buscarPorGenero(String genero) {
        List<Pelicula> resultados = new ArrayList<>();
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getGeneros().contains(genero.toLowerCase())) {
                resultados.add(pelicula);
            }
        }
        return resultados;
    }

    public List<Pelicula> buscarPorActorDirector(String actor, String director) {
        List<Pelicula> resultados = new ArrayList<>();
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getActores().contains(actor.toLowerCase()) &&
                    !pelicula.getDirector().equalsIgnoreCase(director)) {
                resultados.add(pelicula);
            }
        }
        return resultados;
    }

    public List<Pelicula> buscarPorAnioDuracion(int anio, int duracionMaxima) {
        List<Pelicula> resultados = new ArrayList<>();
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getAnioestreno() < anio && pelicula.getDuracion() < duracionMaxima) {
                resultados.add(pelicula);
            }
        }
        return resultados;
    }
}
