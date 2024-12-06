//William Alvey
public class Coffee {
    // Instance variables
    private String name;
    private double caffeineContent;

    // Default amount caffeine 
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50.0;
    }

    //  name for coffee
    public String getName() {
        return this.name;
    }

    //caffeine content
    public double getCaffeineContent() {
        return this.caffeineContent;
    }

    //  for name with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid coffee name.");
        }
    }

    //  for caffeineContent with validation
    public void setCaffeineContent(double caffeineContent) {
        if (caffeineContent >= 50.0 && caffeineContent <= 300.0) {
            this.caffeineContent = caffeineContent;
        } else {
            System.out.println("Caffeine content must be between 50 and 300 mg.");
        }
    }

    // calculate the risky amount of coffee cups
    public double calculateRiskyAmount() {
        return 180.0 / ((this.caffeineContent / 100.0) * 6.0);
    }

    // Equals method to compare two Coffee objects 
    public boolean equals(Coffee other) {
        if (other == null) {
            return false;
        }
        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
    }

    // formatted information about the coffee
    public String toString() {
        return "Coffee Name: " + this.name + "\nCaffeine Content: " + this.caffeineContent + " mg";
    }
}
