package poo.filtrar.parte3.filtros;


import poo.filtrar.parte3.modelo.Elemento;

public class FiltroContiene implements Filtro {
  private String valor;

  public FiltroContiene(String valor) {
    this.valor = valor;
  }

  @Override
  public boolean cumple(Elemento e) {
    return e.getNombre().contains(valor);
  }
}
