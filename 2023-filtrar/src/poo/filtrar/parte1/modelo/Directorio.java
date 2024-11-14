package poo.filtrar.parte1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Elemento {
  private List<Elemento> elementos = new ArrayList<>();

  public Directorio(String nombre) {
    super(nombre);
  }

  @Override
  public int getTamanio() {
    int res = 0;
    for (Elemento e : elementos)
      res += e.getTamanio();
    return res;
  }

  public void agregar(Elemento e) {
    elementos.add(e);
  }

  @Override
  public String toString() {
    return super.toString() + " (directorio)";
  }

}
