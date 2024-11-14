import java.util.ArrayList;

public class PresupuestoComplejo extends PresuCompuesto{
	
	
	private double desc = 0.1;//get y set
	
	
	public PresupuestoComplejo(String nombre, double des) {
		super(nombre);
		desc = des;
	}


	public ArrayList<String> getMateriales(){
		ArrayList<String> salida = new ArrayList<String>();
		for(int i = 0; i < eles.size(); i++) {
			ArrayList<String> aux = eles.get(i).getMateriales();
			for(int j = 0; j<aux.size(); j++) {
		        if(! salida.contains(aux.get(j)))
		        	salida.add(aux.get(j));
		    }
		}
		return salida;
	}
	
	
	public  int getTiempoEstimado() {
		int suma = 0;
		for(int i = 0; i < eles.size();i++) {
			suma = suma + eles.get(i).getTiempoEstimado();
		}
		return suma;
	};
	   public int getCantEmpleados() {
		   int mayor = -1;
		   for(int i = 0; i< eles.size();i++) {
			    int aux = eles.get(i).getCantEmpleados();
			   if(mayor < aux ) {
				   mayor = aux;
			   }
		   }
		   return mayor;
	   }
	   public  double getCosto() {
            double suma = super.getCosto();
			return suma - suma *desc;
	   }


	@Override
	public PresuCompuesto getCascaron() {
		// TODO Auto-generated method stub
		return new PresupuestoComplejo(getNombre(), desc);
	};

	   
	   
}
