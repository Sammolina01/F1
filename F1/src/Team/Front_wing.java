package Team;

public abstract class Front_wing extends PitCrewMember{
	
	private String accion_1;
    private int numero_miembros1;
	public Front_wing(String name, String rol, boolean Equipo, boolean Miembro, String accion_1, int numero_miembros1) {
		super(name, rol, Equipo, Miembro);
		this.accion_1 = "Apply aerodynamic changes to the front wing";
		this.numero_miembros1 = 2;
	}
	
	
	public void setAccion_1(String accion_1) {
		this.accion_1 = "Apply aerodynamic changes to the front wing";
	}
	
	
	public void setNumero_miembros1(int numero_miembros1) {
		this.numero_miembros1 = 2;
	}
	public String accFront_wing() {
		return accion_1;
	}
	public String ajustar_delantero() {
		return "Ajustar aleron delantero";
		
	}
	public int numFront_wing() {
		  return numero_miembros1;
		  
	  }
    
}
