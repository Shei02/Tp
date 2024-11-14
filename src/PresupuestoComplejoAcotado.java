
public class PresupuestoComplejoAcotado extends PresupuestoComplejo {

	
	private Condicion acep;
	
	public PresupuestoComplejoAcotado(String nombre, double des, Condicion cc) {
		super(nombre, des);
		acep = cc;
	}

	
	public void addElemento(ElePresu pp) {
		
		if (acep.cumple(pp))
		  super.addElemento(pp);
	}
	
	public PresuCompuesto getCascaron() {
		return new PresupuestoComplejoAcotado(getNombre(), getTiempoEstimado(), acep);
	}
}
