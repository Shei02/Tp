package poo.filtrar.parte3.utils;

import poo.filtrar.parte3.modelo.Archivo;
import poo.filtrar.parte3.modelo.Directorio;
import poo.filtrar.parte3.modelo.Elemento;

public class Datos {

  public static Elemento getRaiz() {
    // creo los datos
    Archivo arch1 = new Archivo("intro1.txt", 100);
    Archivo arch2 = new Archivo("poo2.txt", 150);
    Archivo arch3 = new Archivo("poo2.txt", 200);
    Archivo arch4 = new Archivo("intro2.txt", 100);

    Directorio directorio = new Directorio("poo");
    directorio.agregar(arch2);
    directorio.agregar(arch3);
    directorio.agregar(arch4);

    Directorio raiz = new Directorio("raiz");
    raiz.agregar(arch1);
    raiz.agregar(directorio);

    // retorno los datos
    return raiz;
  }

}
