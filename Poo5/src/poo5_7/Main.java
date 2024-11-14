package poo5_7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        Socio socio1 = new Socio("Juan", "Perez", 25, true);
        Socio socio2 = new Socio("Maria", "Gomez", 16, false);
        Socio socio3 = new Socio("Carlos", "Lopez", 30, true);

        Alquiler alquiler1 = new Alquiler("2023-09-20", 13, 450.0);
        Alquiler alquiler2 = new Alquiler("2023-09-22", 13, 600.0);
        Alquiler alquiler3 = new Alquiler("2023-09-25", 14, 550.0);

        socio1.registrarAlquiler(alquiler1);
        socio1.registrarAlquiler(alquiler2);
        socio2.registrarAlquiler(alquiler3);

        club.agregarSocio(socio1);
        club.agregarSocio(socio2);
        club.agregarSocio(socio3);

        // a) Todos los socios con cuota impaga, ordenados alfabéticamente
        List<Socio> cuotaImpaga = club.obtenerSociosCuotaImpaga();
        System.out.println("Socios con cuota impaga:");
        for (Socio socio : cuotaImpaga) {
            System.out.println(socio.getApellido() + ", " + socio.getNombre());
        }

        // b) Todos los socios menores de edad, ordenados por edad
        List<Socio> menoresEdad = club.obtenerSociosMenoresEdad();
        System.out.println("\nSocios menores de edad:");
        for (Socio socio : menoresEdad) {
            System.out.println(socio.getNombre() + " - Edad: " + socio.getEdad());
        }

        // c) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados por cantidad total de alquileres de esa cancha
        List<Socio> sociosAlquilaronCancha13 = club.obtenerSociosQueAlquilaronCancha(13);
        System.out.println("\nSocios que alquilaron la cancha N°13:");
        for (Socio socio : sociosAlquilaronCancha13) {
            System.out.println(socio.getApellido() + ", " + socio.getNombre() + " - Total alquileres: " + socio.getAlquileres().size());
        }

        // d) Todos los socios que pagaron más de $500 por algún alquiler de cancha
        List<Socio> pagaronMasDe500 = club.obtenerSociosQuePagaronMasDe500();
        System.out.println("\nSocios que pagaron más de $500:");
        for (Socio socio : pagaronMasDe500) {
            System.out.println(socio.getApellido() + ", " + socio.getNombre() + " - Cuota Pagada: " + socio.isCuotaPaga());
        }

        // Ejemplo de búsqueda combinando criterios
        List<Socio> resultadoBusqueda = club.buscarSociosConCriteriosPersonalizados(true, 0, 13, 0);
        for (Socio socio : resultadoBusqueda) {
            System.out.println(socio.getApellido() + ", " + socio.getNombre());
        }

    }
}