
public class CondicionEmpleado extends Condicion {
  int cant;
  
  public boolean cumple(ElePresu ee) {
	  return ee.getCantEmpleados() <cant;
  }
}
