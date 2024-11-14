package poo5_6;

class Noticia {
    private String titulo;
    private String categoria;
    private String cuerpo;

    public Noticia(String titulo, String categoria, String cuerpo) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.cuerpo = cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}