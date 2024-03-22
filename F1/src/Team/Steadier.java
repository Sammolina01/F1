package Team;

public abstract class Steadier extends PitCrewMember{
	private String accion_4;
    private int numero_miembros4;
	public Steadier(String name, String rol, boolean Equipo, boolean Miembro, String accion_4, int numero_miembros4) {
		super(name, rol, Equipo, Miembro);
		this.accion_4 = "Lift the car in the air from behind or operate the side jack";
		this.numero_miembros4 = 2;
	}

	public void setAccion_4(String accion_4) {
		this.accion_4 = "Lift the car in the air from behind or operate the side jack";
	}
	
	public void setNumero_miembros4(int numero_miembros4) {
		this.numero_miembros4 = numero_miembros4;
	}
    
	public String accSteadier() {
		return accion_4;
	}
	public String ayuda_lateral() {
		return "Levanta el carro por la parte tracera o ayudar en el lateral";
		
	}
	public int numSteadier() {
		  return numero_miembros4;
		  
	  }
    
	

}
