import java.util.ArrayList;
import java.util.Collections;

public abstract class PresuCompuesto extends ElePresu{

	protected ArrayList<ElePresu> eles;
	
	
	
	public PresuCompuesto(String nombre) {
		super(nombre);
		eles = new ArrayList<ElePresu>();
	}



	public void addElemento(ElePresu elem) {
		if (!eles.contains(elem))
			eles.add(elem);
	}
	
	   public  double getCosto() {
		   double suma = 0;
			for(int i = 0; i < eles.size();i++) {
				suma = suma + eles.get(i).getCosto();
			}
			return suma;
	   };
	   
	   public abstract PresuCompuesto getCascaron();
	   
	   public ElePresu getCopia(Condicion c) {
		   PresuCompuesto aux = this.getCascaron();
		   boolean agrego = false;
		   for(int i = 0; i< eles.size(); i++) {
			   ElePresu copia = eles.get(i).getCopia(c);
			   if (copia != null) {
			     aux.addElemento(copia);
			     agrego = true;
			   }  
		   }
		   if (agrego)
		    return aux;
		   else {
			   return null;
		   }
	   }
	   public ArrayList<Tarea> buscar(Condicion c){
		   ArrayList<Tarea> salida = new ArrayList();
		   for(int i = 0; i<eles.size(); i++) {
			    salida.addAll(eles.get(i).buscar(c));
		   }
		   
		   
		   return salida;
	   }
			
}
