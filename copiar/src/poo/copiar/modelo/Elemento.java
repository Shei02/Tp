package poo.copiar.modelo;

public abstract class Elemento {
  private String nombre;

  public Elemento(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public abstract int getTamanio();

  public abstract Elemento copiar();

  @Override
  public String toString() {
    return "{" +
        "nombre=" + nombre + " - " + "tamanio=" + getTamanio() +
        '}';
  }
}
