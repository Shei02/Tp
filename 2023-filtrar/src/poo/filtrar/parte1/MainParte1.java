package poo.filtrar.parte1;

import poo.filtrar.parte1.modelo.Archivo;
import poo.filtrar.parte1.filtros.*;
import poo.filtrar.parte1.utils.Datos;

import java.util.ArrayList;
import java.util.List;

public class MainParte1 {

  public static void main(String[] args) {
    // inicializo los datos
    List<Archivo> archivos = Datos.getArchivos();

    // buscar por nombre contiene
    System.out.println("==========================================");
    System.out.println("Buscar por nombre contiene");
    System.out.println("==========================================");
    Filtro f1 = new FiltroNombreContiene("poo2.txt");
    System.out.println(buscar(archivos, f1));

    // buscar por tamanio menor
    System.out.println("\n==========================================");
    System.out.println("Buscar por tamanio menor");
    System.out.println("==========================================");
    Filtro f2 = new FiltroTamanioMenor(160);
    System.out.println(buscar(archivos, f2));

    // buscar por AND/OR/NOT
    System.out.println("\n==========================================");
    System.out.println("Buscar por AND/OR/NOT");
    System.out.println("==========================================");
    Filtro f3 = new FiltroAnd(f1, f2);
//    Filtro f3 = new FiltroOr(f1, f2);
//    Filtro f3 = new FiltroNot(f2);
    System.out.println(buscar(archivos, f3));
  }

  public static List<Archivo> buscar(List<Archivo> archivos, Filtro f) {
    List<Archivo> res = new ArrayList<>();
    for (Archivo arch: archivos) {
      if (f.cumple(arch)) {
//      if (arch.getNombre().equals(nombre)) {
        res.add(arch);
      }
    }
    return res;
  }

// MAL: codigo repetido
//  public static List<Archivo> buscarPorNombreIgual(List<Archivo> archivos, String nombre) {
//    List<Archivo> res = new ArrayList<>();
//    for (Archivo arch: archivos) {
//      if (arch.getNombre().equals(nombre)) {
//        res.add(arch);
//      }
//    }
//    return res;
//  }
//
//  public static List<Archivo> buscarPorNombreContiene(List<Archivo> archivos, String valor) {
//    List<Archivo> res = new ArrayList<>();
//    for (Archivo arch: archivos) {
//      if (arch.getNombre().contains(valor)) {
//        res.add(arch);
//      }
//    }
//    return res;
//  }

}
