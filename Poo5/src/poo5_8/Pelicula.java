package poo5_8;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private List<String> generos;
    private String director;
    private List<String> actores;
    private int anioestreno;
    private int edadmin;
    private int duracion;

    public Pelicula(String titulo, String sinopsis, List<String> generos ,String director, List<String> actores, int anioestreno, int edadmin, int duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = generos;
        this.director = director;
        this.actores = actores;
        this.anioestreno = anioestreno;
        this.edadmin = edadmin;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public List<String> getGenero() {
        return generos;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActores() {
        return actores;
    }

    public int getAñoestreno() {
        return anioestreno;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public int getDuracion() {
        return duracion;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public int getAnioestreno() {
        return anioestreno;
    }

    public boolean esRentable() {
        // Lógica para determinar si la película es rentable según las políticas del CEO
        if (duracion < 120 && !generos.contains("comedia")) {
            return true;
        }
        if (anioestreno >= 2017 && !(generos.contains("infantil") || generos.contains("documental"))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Sinopsis: " + sinopsis + "\n" +
                "Géneros: " + generos + "\n" +
                "Director: " + director + "\n" +
                "Actores: " + actores + "\n" +
                "Año de Estreno: " + anioestreno + "\n" +
                "Duración: " + duracion + " minutos\n" +
                "Edad Mínima: " + edadmin + "\n";
    }
}
