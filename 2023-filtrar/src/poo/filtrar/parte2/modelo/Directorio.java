package poo.filtrar.parte2.modelo;

import poo.filtrar.parte2.filtros.Filtro;

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

  @Override
  public List<Archivo> buscar(Filtro f) {
    List<Archivo> res = new ArrayList<>();
    for (Elemento elemento: elementos) {
        res.addAll(elemento.buscar(f));
    }
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
