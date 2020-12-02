import java.util.Objects;

public class ElectricalAppliance implements Comparable {
    private String name;
    private int power;
    private int amperage;
    private int serviceLife;
    private boolean isTurnedOn;

    public ElectricalAppliance(String name, int power, int amperage, int serviceLife, boolean isTurnedOn) {
        this.name = name;
        this.power = power;
        this.amperage = amperage;
        this.serviceLife = serviceLife;
        this.isTurnedOn = isTurnedOn;
    }

    public ElectricalAppliance() {
        this.name = "";
        this.power = 0;
        this.amperage = 0;
        this.serviceLife = 0;
        this.isTurnedOn = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        this.serviceLife = serviceLife;
    }

    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    public void setIsTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    @Override
    public String toString() {
        return "Name of appliance: " + name + ", power: " + power + ", amperage: " + amperage +
                ", service life: " + ", is turned on: " + isTurnedOn;
    }

    @Override
    public int compareTo(Object otherElectricalAppliance) {
        return this.power - ((ElectricalAppliance) otherElectricalAppliance).power;
    }
}
