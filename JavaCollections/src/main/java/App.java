public class App {
    public static void main(String[] args) {
        Home home = new Home();

        home.addElectricalAppliance(new ElectricalAppliance("Cooker", 4000, 100, 15, true));
        home.addElectricalAppliance(new ElectricalAppliance("Hairdryer", 1600, 20, 5, false));
        home.addElectricalAppliance(new ElectricalAppliance("Juicer", 1000, 50, 5, true));
        home.addElectricalAppliance(new ElectricalAppliance("Fridge", 3000, 100, 15, true));
        home.addElectricalAppliance(new ElectricalAppliance("Computer", 600, 40, 7, false));

        System.out.println("All electrical appliances: ");
        home.displayAllElectricalAppliances();

        System.out.println("\nHome power: " + home.getHomePower());
        System.out.println("Home amperage: " + home.getHomeAmperage());

        home.sortAppliancesByPower();
        System.out.println("\nSort appliances by power: ");
        home.displayAllElectricalAppliances();

        System.out.println("\nAll turned on appliances: ");
        home.searchTurnedOnAppliance();
    }
}
