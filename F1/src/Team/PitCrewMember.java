package Team;

public abstract class PitCrewMember {

    private String nombre;
    private String rol;
    private boolean Equipo;
    private boolean Miembro;

    public PitCrewMember(String nombre, String rol, boolean Equipo, boolean Miembro) {
        this.nombre = nombre;
        this.rol = rol;
        this.Equipo = Equipo;
        this.Miembro = Miembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getrol() {
        return rol;
    }

    public void setRol(String rol) {
        if (isValidRole(rol)) {
            rol = rol;
        } else {
            
            throw new IllegalArgumentException("Rol inválido: " + rol);
        }
    }

    private boolean isValidRole(String rol) {
        String[] rolesValidos = {"Jackman", "FrontWingChanger", "RearWingChanger", "Refueler", "WheelGunMan"};
        for (String rolValido : rolesValidos) {
            if (rol.equals(rolValido)) {
                return true;
            }
        }
        return false;
    }

    public abstract String getMemberInfo();

    public abstract String performTask();

    public String getRolCompleto() {
        return "Miembro del equipo: " + rol + " - " + nombre;
    }

    public void getEquipo(boolean Equipo) {
        if (Equipo) {
            System.out.println("El miembro pertenece al equipo A.");
        } else {
            System.out.println("El miembro pertenece al equipo B.");
        }
    }

      
    }

