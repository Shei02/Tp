
public class CondicionMateria extends Condicion {

	String mate;
	@Override
	public boolean cumple(ElePresu t) {
		// TODO Auto-generated method stub
	
		return t.getMateriales().contains(mate);
	
	}

}
