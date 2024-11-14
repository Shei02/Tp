package poo.observable.jdk;

import java.util.Observable;

public class MiObservable extends Observable {
  private String nombre;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
    setChanged();
    notifyObservers(nombre);
  }

}
