package poo.observable;

import java.util.ArrayList;
import java.util.List;

public class MiObservable implements IObservable {
  private List<IObserver> observers = new ArrayList<>();
  private String nombre;

  @Override
  public void addObserver(IObserver o) {
    observers.add(o);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
    notificar(nombre);
  }

  public void notificar(Object valor) {
    for (IObserver o : observers)
      o.update(valor);
  }
}
