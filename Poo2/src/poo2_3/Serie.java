package poo2_3;

import java.util.Vector;

public class Serie {
    private final String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Vector<Episodio> episodios;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.episodios = new Vector<Episodio>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public int cantEpVistos(){
        int vistos = 0;
        for(Episodio episodio:episodios){
            if(episodio.visto()){
                vistos++;
            }
        }
        return vistos;
    }

    public float promedioSerie(){
        int suma = 0;
        int contEpisodios = 0;
        float promedio = 0.0f;
        for (Episodio episodio:episodios){
            if (episodio.getCalificacion()>=1){
                contEpisodios++;
                suma+=episodio.getCalificacion();
            }
        }
        promedio = (float) suma / contEpisodios;
        return promedio;
    }

    public Vector<Episodio> episodiosPorTemporada(int temporada){
        Vector<Episodio> resultado = new Vector<Episodio>();
        for(Episodio episodio:episodios){
            if (episodio.getTemporada() == temporada && episodio.visto()){
                resultado.add(episodio);
            }
        }
        return resultado;
    }

    public boolean estanTodosVistos(){
        return cantEpVistos() == episodios.size();
    }

}
