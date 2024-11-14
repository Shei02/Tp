import java.util.ArrayList;

public class PresupuestoUrgente extends PresuCompuesto{
	
	
	private static double adicional = 0.5;//get y set static
	
	
	
	
	public static double getAdicional() {
		return adicional;
	}


	public static void setAdicional(double adicional) {
		PresupuestoUrgente.adicional = adicional;
	}


	public PresupuestoUrgente(String nombre) {
		super(nombre);

	}


	public ArrayList<String> getMateriales(){
		ArrayList<String> salida = new ArrayList<String>();
		for(int i = 0; i < eles.size(); i++) {
			ArrayList<String> aux = eles.get(i).getMateriales();
			salida.addAll(aux);
		}
		return salida;
	}
	
	
	public  int getTiempoEstimado() {
		   int mayor = -1;
		   for(int i = 0; i< eles.size();i++) {
			    int aux = eles.get(i).getTiempoEstimado();
			   if(mayor < aux ) {
				   mayor = aux;
			   }
		   }
		   return mayor;
		

	};
	   public int getCantEmpleados() {
			int suma = 0;
			for(int i = 0; i < eles.size();i++) {
				suma = suma + eles.get(i).getCantEmpleados();
			}
			return suma;
	   }
	   public  double getCosto() {
		   double suma = super.getCosto();
		   return suma + suma *adicional;
	   }


	@Override
	public PresuCompuesto getCascaron() {
		// TODO Auto-generated method stub
		return new PresupuestoUrgente(getNombre());
	};

}