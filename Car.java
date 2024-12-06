public class Car extends Vehicle {
    private double gasMileage; // in miles per gallon
    private int numberOfPassengers;

    // Default Constructor
    public Car() {
        super();
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized Constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName);
        this.gasMileage = gasMileage;
        this.numberOfPassengers = numberOfPassengers;
    }

    // Getters and Setters
    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        this.gasMileage = gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // equals Method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
               numberOfPassengers == car.numberOfPassengers;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " mpg\n" +
               "Passengers: " + numberOfPassengers;
    }
}
