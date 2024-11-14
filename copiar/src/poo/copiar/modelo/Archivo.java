package poo.copiar.modelo;

public class Archivo extends Elemento {
  private int tamanio;

  public Archivo(String nombre, int tamanio) {
    super(nombre);
    this.tamanio = tamanio;
  }

  public void setTamanio(int tamanio) {
    this.tamanio = tamanio;
  }

  @Override
  public int getTamanio() {
    return tamanio;
  }

  public Archivo copiar() {
    return new Archivo(getNombre(), getTamanio());
  }

}
