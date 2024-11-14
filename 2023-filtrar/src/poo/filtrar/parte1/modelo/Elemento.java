package poo.filtrar.parte1.modelo;

public abstract class Elemento {
  private String nombre;

  public Elemento(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public abstract int getTamanio();

  @Override
  public String toString() {
    return "{" +
        "nombre=" + nombre + " - " + "tamanio=" + getTamanio() +
        '}';
  }
}
