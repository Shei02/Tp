package poo.filtrar.parte2;

import poo.filtrar.parte2.filtros.*;
import poo.filtrar.parte2.modelo.Elemento;
import poo.filtrar.parte2.utils.Datos;

public class MainParte2 {

  public static void main(String[] args) {
    // inicializo los datos
    Elemento raiz = Datos.getRaiz();

    // buscar por nombre contiene
    System.out.println("==========================================");
    System.out.println("Buscar por nombre contiene");
    System.out.println("==========================================");
    Filtro f1 = new FiltroContiene("poo2.txt");
    System.out.println(raiz.buscar(f1));

    // buscar por tamanio menor
    System.out.println("\n==========================================");
    System.out.println("Buscar por tamanio menor");
    System.out.println("==========================================");
    Filtro f2 = new FiltroTamanioMenor(160);
    System.out.println(raiz.buscar(f2));

    // buscar por AND
    System.out.println("\n==========================================");
    System.out.println("Buscar por AND");
    System.out.println("==========================================");
    Filtro f3 = new FiltroAnd(f1, f2);
    System.out.println(raiz.buscar(f3));

    // buscar todos
    System.out.println("\n==========================================");
    System.out.println("Buscar todos");
    System.out.println("==========================================");
    Filtro f4 = new FiltroTrue();
    System.out.println(raiz.buscar(f4));
  }

// MAL: no abstrae buscar en jerarquia
//  public static List<Archivo> buscar(Elemento raiz, Filtro f) {
//    List<Archivo> res = new ArrayList<>();
//    for (Elemento elemento: raiz.getElementos()) {
//      if (elemento instanceof Archivo) {
//        Archivo arch = (Archivo) elemento;
//        if (f.cumple(arch)) {
//          res.add(arch);
//        }
//      } else {
//        res.addAll(buscar(elemento, f));
//      }
//    }
//    return res;
//  }

}
