package Team;

public class TeamDriverA extends PitCrewMember {



	public TeamDriverA(String nombre, String rol) {
        super(nombre, rol, false, false);
    }
	@Override
    public String getMemberInfo() {
        return "Piloto del Equipo A: " + getNombre();
    }
	@Override
    public String performTask() {
        switch (getrol()) {
            case "Tyre Gunner (Team A)":
                return "Quita y pone tuerca";
            case "Tyre off (Team A)":
                return "Remueve la llananta";
            case "Tyre on (Team A)":
            	return "Lleva la llanta y la pone";
            case "Front jack (Team A)":
            	return "Levanta el carro";
            case "Rear jack (Team A)":
            	return "Levantar parte tracera del carro";
            case "Stadier (Team A)":
            	return "Levanta el carro por la parte tracera o ayudar en el lateral";
            case "Front wing":
            	return "Ajustar aleron delantero";
            case "Lollipop man (Team A)":
            	return "Da la señal de salida con la bandera";
            	
            default:
               
                throw new IllegalArgumentException("Rol de equipo A no válido: " + getrol());
        }
    
    }
	  private String getEquipoInterno() {
		    return "Equipo B";
		}
	
	
	
	
	
	
	
	
	
}
