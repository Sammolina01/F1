package Team;


public abstract class TeamDriverB extends PitCrewMember{

	public TeamDriverB(String nombre, String rol) {
        super(nombre, rol, false, false);
    }
	@Override
    public String getMemberInfo() {
        return "Piloto del Equipo b: " + getNombre();
    }
	@Override
    public String performTask() {
        switch (getrol()) {
            case "Tyre Gunner (Team B)":
                return "Quita y pone tuerca";
            case "Tyre off (Team B)":
                return "Remueve la llananta";
            case "Tyre on (Team B)":
            	return "Lleva la llanta y la pone";
            case "Front jack (Team B)":
            	return "Levanta el carro";
            case "Rear jack (Team B)":
            	return "Levantar parte tracera del carro";
            case "Stadier  (Team A)":
            	return "Levanta el carro por la parte tracera o ayudar en el lateral";
            case "Front wing":
            	return "Ajustar aleron delantero";
            case "Lollipop man (Team B)":
            	return "Da la señal de salida con la bandera";
            	
            default:
               
                throw new IllegalArgumentException("Rol de equipo A no válido: " + getrol());
        }
    
    }
	  private String getEquipoInterno() {
		    return "Equipo B";
		}
	
	
	
	
	
	
	
	
	
}

