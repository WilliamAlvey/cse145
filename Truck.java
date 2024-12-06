public class Truck extends Vehicle {
    private double loadCapacity; // in tons
    private double towingCapacity; // in pounds

    // Default Constructor
    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized Constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    // Getters and Setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Truck truck = (Truck) obj;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
               Double.compare(truck.towingCapacity, towingCapacity) == 0;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Load Capacity: " + loadCapacity + " tons\n" +
               "Towing Capacity: " + towingCapacity + " pounds";
    }
}
