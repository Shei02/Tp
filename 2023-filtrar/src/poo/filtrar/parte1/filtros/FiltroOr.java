package poo.filtrar.parte1.filtros;


import poo.filtrar.parte1.modelo.Archivo;

public class FiltroOr implements Filtro {
  private Filtro f1;
  private Filtro f2;

  public FiltroOr(Filtro f1, Filtro f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return f1.cumple(arch) || f2.cumple(arch);
  }
}
