
public class CondicionTiempo extends Condicion {

	int tiempo;
	@Override
	public boolean cumple(ElePresu t) {
		// TODO Auto-generated method stub
		return t.getTiempoEstimado()<tiempo;
	}

}
