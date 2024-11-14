package poo.filtrar.parte1.utils;

import poo.filtrar.parte1.modelo.Archivo;
import poo.filtrar.parte1.modelo.Directorio;
import poo.filtrar.parte1.modelo.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Datos {

  public static List<Archivo> getArchivos() {
    // inicializo los datos
    List<Archivo> archivos = new ArrayList<>();

    // agrego los datos
    archivos.add(new Archivo("poo1.txt", 100));
    archivos.add(new Archivo("poo2.txt", 150));
    archivos.add(new Archivo("poo2.txt", 200));
    archivos.add(new Archivo("poo3.txt", 100));

    // retorno los datos
    return archivos;
  }

}
