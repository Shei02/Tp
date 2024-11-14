package poo.filtrar.parte2.modelo;

import poo.filtrar.parte2.filtros.Filtro;

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

  public abstract List<Archivo> buscar(Filtro f);

  @Override
  public String toString() {
    return "{" +
        "nombre=" + nombre + " - " + "tamanio=" + getTamanio() +
        '}';
  }
}
