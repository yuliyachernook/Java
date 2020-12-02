import java.util.ArrayList;
import java.util.Collections;

public class Home {
    ArrayList<ElectricalAppliance> homeElectricalAppliances;

    public Home(){
        homeElectricalAppliances = new ArrayList<ElectricalAppliance>();
    }

    public void addElectricalAppliance(ElectricalAppliance electricalAppliance){
        homeElectricalAppliances.add(electricalAppliance);
    }

    public void removeElectricalAppliance(ElectricalAppliance electricalAppliance){
        homeElectricalAppliances.remove(electricalAppliance);
    }

    public void removeAllElectricalAppliance(){
        homeElectricalAppliances.clear();
    }

    public int getHomePower(){
        int homePower = 0;
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getIsTurnedOn())
                homePower += electricalAppliance.getPower();
        }
        return homePower;
    }

    public int getHomeAmperage(){
        int homeAmperage = 0;
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getIsTurnedOn())
                homeAmperage += electricalAppliance.getAmperage();
        }
        return homeAmperage;
    }

    public void searchApplianceByName(String name){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getName() == name)
                System.out.println(electricalAppliance.toString());
        }
    }

    public void searchApplianceByPower(int power){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getPower() == power)
                System.out.println(electricalAppliance.toString());
        }
    }

    public void searchApplianceByAmperage(int amperage){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getAmperage() == amperage)
                System.out.println(electricalAppliance.toString());
        }
    }

    public void searchApplianceByStorageLife(int storageLife){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getAmperage() == storageLife)
                System.out.println(electricalAppliance.toString());
        }
    }

    public void searchTurnedOnAppliance(){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            if(electricalAppliance.getIsTurnedOn() == true)
                System.out.println(electricalAppliance.toString());
        }
    }

    public void sortAppliancesByPower(){
        Collections.sort(homeElectricalAppliances);
    }

    public void displayAllElectricalAppliances(){
        for (ElectricalAppliance electricalAppliance: homeElectricalAppliances) {
            System.out.println(electricalAppliance.toString());
        }
    }
}
