package poo.observable;

public class MiObserver implements IObserver {
  private String id;

  public MiObserver(String id) {
    this.id = id;
  }

  @Override
  public void update(Object data) {
    System.out.println("Observer con id " + id + " recibio el evento " + data);
  }
}
