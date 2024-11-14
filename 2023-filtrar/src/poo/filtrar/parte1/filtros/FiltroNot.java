package poo.filtrar.parte1.filtros;


import poo.filtrar.parte1.modelo.Archivo;

public class FiltroNot implements Filtro {
  private Filtro f1;

  public FiltroNot(Filtro f1) {
    this.f1 = f1;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return !f1.cumple(arch);
  }
}
