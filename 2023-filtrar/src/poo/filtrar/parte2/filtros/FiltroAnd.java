package poo.filtrar.parte2.filtros;


import poo.filtrar.parte2.modelo.Archivo;

public class FiltroAnd implements Filtro {
  private Filtro f1;
  private Filtro f2;

  public FiltroAnd(Filtro f1, Filtro f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  @Override
  public boolean cumple(Archivo arch) {
    return f1.cumple(arch) && f2.cumple(arch);
  }
}
