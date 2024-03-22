package Team;

public abstract class Front_jack extends PitCrewMember{
	
	private String accion8;
	private int numero_miembros8;
	public Front_jack(String name, String rol, boolean Equipo, boolean Miembro, String accion8,
			int numero_miembros8) {
		super(name, rol, Equipo, Miembro);
		this.accion8 = "Lift the front of the car in the air to allow the tyres to be changed";
		this.numero_miembros8 = 2;
	}
	
	public void setAccion8(String accion8) {
		this.accion8 = "Lift the front of the car in the air to allow the tyres to be changed";
	}
	
	public void setNumero_miembros8(String numero_miembros8) {
		this.numero_miembros8 = 2;
	}
	
	public String accFront_jack() {
		return accion8;
	}
	public String levantarCarro() {
		return "Levanta el carro";
		
	}
	public int numFront_jack() {
		  return numero_miembros8;
		  
	  }
	
		
}
