package poo5_6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServidorDeNoticias servidor = new ServidorDeNoticias();

        Usuario usuario1 = new Usuario("Usuario1");
        usuario1.agregarPreferencia("deportes");
        usuario1.agregarPreferencia("Maradona");
        servidor.suscribirUsuario(usuario1, "deportes");

        Noticia noticia1 = new Noticia("Nuevo gol de Maradona", "deportes", "Maradona marcó un gol en el partido.");
        servidor.agregarNoticia(noticia1);

        Usuario usuario2 = new Usuario("Usuario2");
        usuario2.agregarPreferencia("policiales");
        servidor.suscribirUsuario(usuario2, "policiales");

        Noticia noticia2 = new Noticia("Robo en la calle principal", "policiales", "Se produjo un robo en la calle principal.");
        servidor.agregarNoticia(noticia2);

        List<Noticia> resultado = servidor.buscarPorCombinacionCriterios("Maradona", "deportes", null, null, 0);
        for (Noticia noticia : resultado) {
            System.out.println("Resultado de búsqueda: " + noticia.getTitulo());
        }
    }
}
