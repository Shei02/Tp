package poo.filtrar.parte2.filtros;


import poo.filtrar.parte2.modelo.Archivo;

public class FiltroContiene implements Filtro {
  private String valor;

  public FiltroContiene(String valor) {
    this.valor = valor;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return arch.getNombre().contains(valor);
  }
}
