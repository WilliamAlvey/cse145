public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default Constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 0;
        this.ownerName = "Unknown";
    }

    // Parameterized Constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.ownerName = ownerName;
    }

    // Getters and Setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfCylinders == vehicle.numberOfCylinders &&
               manufacturerName.equals(vehicle.manufacturerName) &&
               ownerName.equals(vehicle.ownerName);
    }

    // toString Method
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturerName + "\n" +
               "Cylinders: " + numberOfCylinders + "\n" +
               "Owner: " + ownerName;
    }
}
