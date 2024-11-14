import java.util.ArrayList;

public abstract class ElePresu {

	 private String nombre; //get y set

	 
	 
	 
   public abstract ArrayList<String> getMateriales();
   public abstract int getTiempoEstimado();
   public abstract int getCantEmpleados();
   public abstract double getCosto();
   
   public abstract ElePresu   getCopia(Condicion c);
	 
   public abstract ArrayList<Tarea> buscar(Condicion c);
	public ElePresu(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	public boolean equals(Object o1) {
		try {
			ElePresu ee = (ElePresu)o1;
			return nombre.equals(ee.getNombre());
		} catch(Exception e) {
			return false;
		}
	}
	 
	 
}
