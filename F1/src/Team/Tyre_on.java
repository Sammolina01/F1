package Team;

public abstract class Tyre_on extends PitCrewMember{
	private String accion_7;
    private int numero_miembros7;
	public Tyre_on(String name, String rol, boolean Equipo, boolean Miembro, String accion_7, int numero_miembros7) {
		super(name, rol, Equipo, Miembro);
		this.accion_7 = "Bring tyres to the pit box and fit on to the car";
		this.numero_miembros7 = 4;
	}

	public void setAccion_7(String accion_7) {
		this.accion_7 = "Bring tyres to the pit box and fit on to the car";
	}
	
	public void setNumero_miembros7(int numero_miembros7) {
		this.numero_miembros7 = 4;
	}
	public void setAccion_6(String accion_7) {
		this.accion_7 = "Remove the tyres";
	}

	public String accTyre_on() {
		return accion_7;
	}
	

	public String llevaLlanta_poneLlanta() {
		return "Lleva la llanta y la pone";	
	}

	
	public int numTyre_on () {
		  return numero_miembros7;
		  
	  }
}
