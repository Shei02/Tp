package poo.filtrar.parte2.filtros;


import poo.filtrar.parte2.modelo.Archivo;

public class FiltroTrue implements Filtro {
  @Override
  public boolean cumple(Archivo arch) {
    return true;
  }
}
