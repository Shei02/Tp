package poo2_3;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto = false;
    private int calificacion = -1;
    private int temporada;

    public Episodio(String titulo, String descripcion, int temporada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public boolean visto() {
        return visto;
    }

    public void verEpisodio() {
        visto = true;
    }

    public void calificar(int calificacion) {
        if (calificacion >= 1 || calificacion <= 5){
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificacion debe estar entre 1 y 5");
        }
    }
}
