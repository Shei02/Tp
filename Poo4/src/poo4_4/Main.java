package poo4_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear las casas de Hogwarts
        Casa griffindor = new Casa("Griffindor", Set.of("valentía", "coraje"), 5,0);
        Casa slytherin = new Casa("Slytherin", Set.of("astucia", "ambición"), 4, 0);
        Casa ravenclaw = new Casa("Ravenclaw", Set.of("inteligencia", "creatividad"), 3, 0);
        Casa hufflepuff = new Casa("Hufflepuff", Set.of("lealtad", "amabilidad"), 4, 0);

        // Establecer enemistad entre Griffindor y Slytherin
        griffindor.setEnemiga(slytherin);
        slytherin.setEnemiga(griffindor);

        // Agregar familiares a las casas
        griffindor.agregarFamiliar("Harry Potter");
        griffindor.agregarFamiliar("Ginny Weasley");
        slytherin.agregarFamiliar("Draco Malfoy");
        ravenclaw.agregarFamiliar("Luna Lovegood");
        hufflepuff.agregarFamiliar("Cedric Diggory");

        // Crear alumnos
        Alumno alumno1 = new Alumno("Hermione Granger", Set.of("inteligencia", "valentía"), "Hermione's Parent");
        Alumno alumno2 = new Alumno("Ron Weasley", Set.of("valentía"), "Molly Weasley");
        Alumno alumno3 = new Alumno("Draco Malfoy", Set.of("astucia", "ambición"), "Lucius Malfoy");
        Alumno alumno4 = new Alumno("Luna Lovegood", Set.of("inteligencia", "creatividad"), "Xenophilius Lovegood");

        Escuela hogwarts = new Escuela();
        hogwarts.agregarCasa(griffindor);
        hogwarts.agregarCasa(slytherin);
        hogwarts.agregarCasa(ravenclaw);
        hogwarts.agregarCasa(hufflepuff);

        // Asignar alumnos a casas
        Casa casaAlumno1 = hogwarts.asignarAlumno(alumno1);
        Casa casaAlumno2 = hogwarts.asignarAlumno(alumno2);
        Casa casaAlumno3 = hogwarts.asignarAlumno(alumno3);
        Casa casaAlumno4 = hogwarts.asignarAlumno(alumno4);

        // Mostrar las casas asignadas a los alumnos
        System.out.println("Casa asignada a " + alumno1.getNombre() + ": " + (casaAlumno1 != null ? casaAlumno1.getNombre() : "Ninguna"));
        System.out.println("Casa asignada a " + alumno2.getNombre() + ": " + (casaAlumno2 != null ? casaAlumno2.getNombre() : "Ninguna"));
        System.out.println("Casa asignada a " + alumno3.getNombre() + ": " + (casaAlumno3 != null ? casaAlumno3.getNombre() : "Ninguna"));
        System.out.println("Casa asignada a " + alumno4.getNombre() + ": " + (casaAlumno4 != null ? casaAlumno4.getNombre() : "Ninguna"));
    }
}