package poo.observable;

public class MainObservable {

  public static void main(String[] args) {
    IObserver o1 = new MiObserver("1");
    IObserver o2 = new MiObserver("2");
    IObserver o3 = new MiObserver("3");

    MiObservable observable = new MiObservable();
    observable.addObserver(o1);
    observable.addObserver(o2);
    observable.addObserver(o3);

    observable.setNombre("poo");
  }

}
