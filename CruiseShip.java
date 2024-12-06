//william alvey
public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crew;

    // constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crew) {
        super(name, launchDate);
        this.passengerCapacity = passengerCapacity;
        this.crew = crew;
    }

    // Overridden toString to include specific details
    @Override
    public String toString() {
        return super.toString() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crew;
    }
}

