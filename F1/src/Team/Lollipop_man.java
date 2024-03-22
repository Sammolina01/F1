package Team;

public abstract class Lollipop_man extends PitCrewMember{
	
	private String accion_2;
    private int numero_miembros2;
	public Lollipop_man(String name, String rol, boolean Equipo, boolean Miembro, String accion_2,
			int numero_miembros2) {
		super(name, rol, Equipo, Miembro);
		this.accion_2 = "Give the signal for the car to be released";
		this.numero_miembros2 = 1;
	}
	
	
	public void setAccion_2(String accion_2) {
		this.accion_2 = "Give the signal for the car to be released";
	}

	public void setNumero_miembros2(int numero_miembros2) {
		this.numero_miembros2 = 1;
	}
	
	public String accLollipop() {
		return accion_2;
	}
	public String salida() {
		return "Da la señal de salida con la bandera";
		
	}
	public int numLollipop() {
		  return numero_miembros2;
		  
	  }
    
}
