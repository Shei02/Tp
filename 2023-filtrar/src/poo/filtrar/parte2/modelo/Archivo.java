package poo.filtrar.parte2.modelo;

import poo.filtrar.parte2.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Archivo extends Elemento {
  private int tamanio;

  public Archivo(String nombre, int tamanio) {
    super(nombre);
    this.tamanio = tamanio;
  }

  @Override
  public List<Archivo> buscar(Filtro f) {
    List<Archivo> res = new ArrayList<>();
    if (f.cumple(this)) {
      res.add(this);
    }
    return res;
  }

  @Override
  public int getTamanio() {
    return tamanio;
  }

}
