	package Team;
	import java.util.ArrayList;
	import java.util.List;
	
	class F1Team {
		    private String nombre;
		    private int añoFundacion;
	
		    public F1Team(String nombre, int añoFundacion) {
		        this.nombre = nombre;
		        this.añoFundacion = añoFundacion;
		    }
	
		    public String getNombre() {
		        return nombre;
		    }
	
		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }
	
		    public int getAñoFundacion() {
		        return añoFundacion;
		    }
	
		    public void setAñoFundacion(int añoFundacion) {
		        this.añoFundacion = añoFundacion;
		    }
	
		    @Override
		    public String toString() {
		        return "F1Team{" +
		                "nombre='" + nombre + '\'' +
		                ", añoFundacion=" + añoFundacion +
		                '}';
		    }
		}