//william alvey
public class CargoShip extends Ship {
    private int tonnage;
    private double maxSpeed;

    // constructor
    public CargoShip(String name, String launchDate, int tonnage, double maxSpeed) {
        super(name, launchDate);
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // Overridden toString to include specific details
    @Override
    public String toString() {
        return super.toString() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}
