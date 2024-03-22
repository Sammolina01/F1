package Team;

public abstract class Rear_jack extends PitCrewMember{
	private String accion_3;
    private int numero_miembros3;
	public Rear_jack(String name, String rol, boolean Equipo, boolean Miembro, String accion_3, int numero_miembros3) {
		super(name, rol, Equipo, Miembro);
		this.accion_3 = "Lift the car in the air from behind";
		this.numero_miembros3 = 2;
		
	}

	public void setAccion_3(String accion_3) {
		this.accion_3 = "Lift the car in the air from behind";
	}
	
	public void setNumero_miembros3(int numero_miembros3) {
		this.numero_miembros3 = 2;
	}
    
	public String accRear_jack() {
		return accion_3;
	}
	public String levantarCarroAtras() {
		return "Levantar parte tracera del carro";
		
	}
	public int numRear_Jack() {
		  return numero_miembros3;
		  
	  }

	

}
