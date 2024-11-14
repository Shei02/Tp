package poo.observable.jdk;

import java.util.Observable;
import java.util.Observer;

public class MiObserver implements Observer {
  private String id;

  public MiObserver(String id) {
    this.id = id;
  }

  @Override
  public void update(Observable observable, Object data) {
    System.out.println("Observer con id " + id + " recibio el evento " + data);
  }
}
