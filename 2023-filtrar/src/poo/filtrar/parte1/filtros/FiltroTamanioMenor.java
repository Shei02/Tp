package poo.filtrar.parte1.filtros;


import poo.filtrar.parte1.modelo.Archivo;

public class FiltroTamanioMenor implements Filtro {
  private int valor;

  public FiltroTamanioMenor(int valor) {
    this.valor = valor;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return arch.getTamanio() < valor;
  }
}
