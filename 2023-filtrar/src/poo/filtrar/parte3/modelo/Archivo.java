package poo.filtrar.parte3.modelo;

public class Archivo extends Elemento {
  private int tamanio;

  public Archivo(String nombre, int tamanio) {
    super(nombre);
    this.tamanio = tamanio;
  }

  @Override
  public int getTamanio() {
    return tamanio;
  }

}
