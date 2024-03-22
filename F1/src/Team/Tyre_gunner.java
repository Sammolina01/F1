package Team;

public abstract class Tyre_gunner extends PitCrewMember{
	private String accion_5;
    private int numero_miembros5;
	public Tyre_gunner(String name, String rol, boolean Equipo, boolean Miembro, String accion_5,
			int numero_miembros5) {
		super(name, rol, Equipo, Miembro);
		this.accion_5 = "Operate wheel gun to remove and fit wheel nut";
		this.numero_miembros5 = 4;
	}
	
	public void setAccion_5(String accion_5) {
		this.accion_5 = "Operate wheel gun to remove and fit wheel nut";
	}

	
	public void setNumero_miembros5(int numero_miembros5) {
		this.numero_miembros5 = 4;
	}
    
  public String accTyre_gunner(String accion_5) {
	 return accion_5;
  }
	
  public String poneTuerca_quitaTuerca() {
	  
	  return "Quita y pone tuerca"; 
  }
 
  public int num_tyre_gunner () {
	  return numero_miembros5;
	  
  }
}
