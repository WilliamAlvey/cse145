//William Alvey

import java.util.Scanner;

public class Apple {
    //  variables
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.5;
        this.price = 0.88;
    }

    
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessor for type
    public String getType() {
        return type;
    }

    // Mutator for type with validation
    public void setType(String type) {
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") || 
            type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            System.out.println("Invalid value for type!");
            this.type = null; // Set to null if invalid
        }
    }

    // Accessor for weight
    public double getWeight() {
        return weight;
    }

    //  for weight with 
    public void setWeight(double weight) {
        if (weight > 0 && weight <= 2.0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value for weight!");
            this.weight = 0.0;
        }
    }

    // Accessor for price
    public double getPrice() {
        return price;
    }

    // Mutator for price with validation
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid value for price!");
            this.price = 0.0; // Set to 0.0 if invalid
        }
    }

    //  display the values of the variables
    public void writeOutput() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}
