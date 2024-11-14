package poo.filtrar.parte3;

import poo.filtrar.parte3.filtros.Filtro;
import poo.filtrar.parte3.filtros.FiltroContiene;
import poo.filtrar.parte3.modelo.Elemento;
import poo.filtrar.parte3.utils.Datos;

public class MainParte3 {

  public static void main(String[] args) {
    // inicializo los datos
    Elemento raiz = Datos.getRaiz();

    // buscar por nombre contiene
    System.out.println("==========================================");
    System.out.println("Buscar por nombre contiene");
    System.out.println("==========================================");
    Filtro f1 = new FiltroContiene("poo");
    System.out.println(raiz.buscar(f1));
  }

}
