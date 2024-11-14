package poo5_6;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import poo5_6.Noticia;
import poo5_6.Usuario;

class ServidorDeNoticias {
    private List<Noticia> noticias;
    private Map<Usuario, List<String>> suscripciones;

    public ServidorDeNoticias() {
        this.noticias = new ArrayList<>();
        this.suscripciones = new HashMap<>();
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
        notificarUsuarios(noticia);
    }

    public void suscribirUsuario(Usuario usuario, String preferencia) {
        if (!suscripciones.containsKey(usuario)) {
            suscripciones.put(usuario, new ArrayList<>());
        }
        suscripciones.get(usuario).add(preferencia);
    }

    public void notificarUsuarios(Noticia noticia) {
        for (Usuario usuario : suscripciones.keySet()) {
            List<String> preferencias = suscripciones.get(usuario);
            if (preferencias.contains(noticia.getCategoria()) && contieneAlgunaPreferencia(noticia.getCuerpo(), preferencias)) {
                System.out.println("Notificando a " + usuario.getNombre() + ": " + noticia.getTitulo());
            }
        }
    }

    private boolean contieneAlgunaPreferencia(String cuerpoNoticia, List<String> preferencias) {
        for (String preferencia : preferencias) {
            if (cuerpoNoticia.contains(preferencia)) {
                return true;
            }
        }
        return false;
    }

    public List<Noticia> buscarPorTitulo(String frase) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            if (noticia.getTitulo().contains(frase)) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }

    public List<Noticia> buscarPorCategoria(String categoria) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            if (noticia.getCategoria().equals(categoria)) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }

    public List<Noticia> buscarPorPalabraEnCuerpo(String palabra) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            if (noticia.getCuerpo().contains(palabra)) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }

    public List<Noticia> buscarPorListaPalabrasEnCuerpo(List<String> palabras) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            boolean todasLasPalabrasEncontradas = true;
            for (String palabra : palabras) {
                if (!noticia.getCuerpo().contains(palabra)) {
                    todasLasPalabrasEncontradas = false;
                    break;
                }
            }
            if (todasLasPalabrasEncontradas) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }

    public List<Noticia> buscarPorLimitePalabrasEnCuerpo(int limite) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            String[] palabras = noticia.getCuerpo().split("\\s+");
            if (palabras.length <= limite) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }

    public List<Noticia> buscarPorCombinacionCriterios(String frase, String categoria, String palabra, List<String> palabras, int limite) {
        List<Noticia> resultado = new ArrayList<>();
        for (Noticia noticia : noticias) {
            boolean cumpleFrase = frase == null || noticia.getTitulo().contains(frase);
            boolean cumpleCategoria = categoria == null || noticia.getCategoria().equals(categoria);
            boolean cumplePalabra = palabra == null || noticia.getCuerpo().contains(palabra);
            boolean cumplePalabras = palabras == null || buscarPorListaPalabrasEnCuerpo(palabras).contains(noticia);
            boolean cumpleLimite = limite <= 0 || buscarPorLimitePalabrasEnCuerpo(limite).contains(noticia);

            if (cumpleFrase && cumpleCategoria && cumplePalabra && cumplePalabras && cumpleLimite) {
                resultado.add(noticia);
            }
        }
        return resultado;
    }
}