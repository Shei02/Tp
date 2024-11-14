package poo.filtrar.parte3.modelo;

import poo.filtrar.parte3.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public abstract class Elemento {
  private String nombre;

  public Elemento(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract int getTamanio();

  public List<Elemento> buscar(Filtro f) {
    List<Elemento> res = new ArrayList<>();
    if (f.cumple(this)) {
      res.add(this);
    }
    return res;
  }

  @Override
  public String toString() {
    return "{" +
        "nombre=" + nombre + " - " + "tamanio=" + getTamanio() +
        '}';
  }
}
