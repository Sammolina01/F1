package Team;


public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases que representan los roles y tareas en el equipo de F1
        PitCrewMember tyreGunner = new Tyre_gunnerImpl("John", "Tyre Gunner (Team A)");
        PitCrewMember tyreOff = new Tyre_offImpl("Jane", "Tyre off (Team A)");
        PitCrewMember tyreOn = new Tyre_onImpl("Jack", "Tyre on (Team A)");
        PitCrewMember frontJack = new Front_jackImpl("Jill", "Front jack (Team A)");
        PitCrewMember rearJack = new Rear_jackImpl("Rick", "Rear jack (Team A)");
        PitCrewMember steadier = new SteadierImpl("Rachel", "Stadier", true, true);
        PitCrewMember frontWing = new Front_wingImpl("Robert", "Front wing");
        PitCrewMember lollipopMan = new Lollipop_manImpl("Will", "Lollipop man (Team A)");

        // Mostrar información de cada miembro del equipo
        System.out.println("Miembros del equipo de Fórmula 1:");
        System.out.println("Acción de " + tyreGunner.getNombre() + ": " + tyreGunner.performTask());
        System.out.println("Acción de " + tyreOff.getNombre() + ": " + tyreOff.performTask());
        System.out.println("Acción de " + tyreOn.getNombre() + ": " + tyreOn.performTask());
        System.out.println("Acción de " + frontJack.getNombre() + ": " + frontJack.performTask());
        System.out.println("Acción de " + rearJack.getNombre() + ": " + rearJack.performTask());
        System.out.println("Acción de " + steadier.getNombre() + ": " + steadier.performTask());
        System.out.println("Acción de " + frontWing.getNombre() + ": " + frontWing.performTask());
        System.out.println("Acción de " + lollipopMan.getNombre() + ": " + lollipopMan.performTask());
    }
}
