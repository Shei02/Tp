package poo5_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import poo5_7.Socio;

public class Club {
    private List<Socio> socios;

    public Club() {
        this.socios = new ArrayList<>();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public List<Socio> obtenerSociosCuotaImpaga() {
        List<Socio> cuotaImpaga = new ArrayList<>();
        for (Socio socio : socios) {
            if (!socio.isCuotaPaga()) {
                cuotaImpaga.add(socio);
            }
        }
        Collections.sort(cuotaImpaga, Comparator.comparing(Socio::getApellido).thenComparing(Socio::getNombre));
        return cuotaImpaga;
    }

    public List<Socio> obtenerSociosMenoresEdad() {
        List<Socio> menoresEdad = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.getEdad() < 18) {
                menoresEdad.add(socio);
            }
        }
        menoresEdad.sort(Comparator.comparingInt(Socio::getEdad));
        return menoresEdad;
    }

    public List<Socio> obtenerSociosQueAlquilaronCancha(int canchaID) {
        List<Socio> sociosAlquilaron = new ArrayList<>();
        for (Socio socio : socios) {
            for (Alquiler alquiler : socio.getAlquileres()) {
                if (alquiler.getIdCancha() == canchaID) {
                    sociosAlquilaron.add(socio);
                    break;
                }
            }
        }
        sociosAlquilaron.sort(Comparator.comparingInt((Socio s) -> s.getAlquileres().size()).reversed());
        return sociosAlquilaron;
    }

    public List<Socio> obtenerSociosQuePagaronMasDe500() {
        List<Socio> pagaronMasDe500 = new ArrayList<>();
        List<Socio> morosos = new ArrayList<>();
        for (Socio socio : socios) {
            boolean pagaron = false;
            for (Alquiler alquiler : socio.getAlquileres()) {
                if (alquiler.getPrecio() > 500) {
                    pagaron = true;
                    break;
                }
            }
            if (pagaron) {
                pagaronMasDe500.add(socio);
            } else {
                morosos.add(socio);
            }
        }
        pagaronMasDe500.sort(Comparator.comparing(Socio::getNombre));
        morosos.sort(Comparator.comparing(Socio::getNombre));
        pagaronMasDe500.addAll(morosos);
        return pagaronMasDe500;
    }
    public List<Socio> buscarSociosConCriteriosPersonalizados(
            boolean cuotaImpaga,
            int edadMaxima,
            int canchaID,
            double montoMinimo) {

        List<Socio> resultado = new ArrayList<>();

        for (Socio socio : socios) {
            boolean cumpleCriterios = true;

            if (cuotaImpaga && socio.isCuotaPaga()) {
                cumpleCriterios = false;
            }

            if (edadMaxima > 0 && socio.getEdad() > edadMaxima) {
                cumpleCriterios = false;
            }

            if (canchaID > 0) {
                boolean alquiloCancha = false;
                for (Alquiler alquiler : socio.getAlquileres()) {
                    if (alquiler.getIdCancha() == canchaID) {
                        alquiloCancha = true;
                        break;
                    }
                }
                if (!alquiloCancha) {
                    cumpleCriterios = false;
                }
            }

            if (montoMinimo > 0) {
                boolean pagoMasDe500 = false;
                for (Alquiler alquiler : socio.getAlquileres()) {
                    if (alquiler.getPrecio() > montoMinimo) {
                        pagoMasDe500 = true;
                        break;
                    }
                }
                if (!pagoMasDe500) {
                    cumpleCriterios = false;
                }
            }

            if (cumpleCriterios) {
                resultado.add(socio);
            }
        }
        return resultado;
    }
}
