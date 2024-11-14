package poo.filtrar.parte1.filtros;


import poo.filtrar.parte1.modelo.Archivo;

public class FiltroNombreContiene implements Filtro {
  private String valor;

  public FiltroNombreContiene(String valor) {
    this.valor = valor;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return arch.getNombre().contains(valor);
  }
}
