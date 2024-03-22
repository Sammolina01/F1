package Team;

public abstract class Tyre_off extends PitCrewMember{
	private String accion_6;
    private int numero_miembros6;
	public Tyre_off(String name, String rol, boolean Equipo, boolean Miembro, String accion_6, int numero_miembros6) {
		super(name, rol, Equipo, Miembro);
		this.accion_6 = "Remove the tyres";
		this.numero_miembros6 = 4;
	}
	
	public void setAccion_6(String accion_6) {
		this.accion_6 = "Remove the tyres";
	}
	
	public void setNumero_miembros6(int numero_miembros6) {
		this.numero_miembros6 = 4;
	}
    
	 public String accTyre_gunner(String accion_6) {
		 return accion_6;
	  }
	
	public String remueveLlanta() {
		return "Remueve la llananta";
	}
	
	public int numTyre_off () {
		  return numero_miembros6;
		  
	  }
}
