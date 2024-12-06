//William Alvey
import java.util.Scanner;
public class homework04{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      //stores circle areas
        double[] circleAreas = null;  
        boolean collectionCreated = false;

        while (true) {
            System.out.println("--- Circle Collection Menu ---");
            System.out.println("1. Create circle collection");
            System.out.println("2. Sort areas (smallest to largest)");
            System.out.println("3. Sort areas (largest to smallest)");
            System.out.println("4. Find and display unique areas");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    circleAreas = createCircleCollection(scanner);
                    collectionCreated = true;
                    
                    break;
               
                case 2:
                    if (collectionCreated) {
                        sortAreas(circleAreas, true);
                        displayAreas(circleAreas);
                    } 
                    else {
                        System.out.println("Circle collection not created yet.");
                    }
                    
                    break;
                
                case 3:
                    if (collectionCreated) {
                        sortAreas(circleAreas, false);
                        displayAreas(circleAreas);
                    } 
                    else {
                        System.out.println("Circle collection not created yet.");
                    }
                    
                    break;
                
                case 4:
                    if (collectionCreated) {
                        displayUniqueAreas(circleAreas);
                    }
                    
                    else {
                        System.out.println("Circle collection not created yet.");
                    }
                   
                    break;
                    
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // This create circle collection
    public static double[] createCircleCollection(Scanner scanner) {
        System.out.print("Enter the number of circles: ");
        int numCircles = scanner.nextInt();

        while (numCircles <= 0) {
            System.out.print("Invalid input. Please enter a positive number: ");
            numCircles = scanner.nextInt();
        }

        double[] areas = new double[numCircles];

        for (int i = 0; i < numCircles; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            areas[i] = calculateArea(radius);
        }

        return areas;
    }

    //calculate the area of a circle
    public static double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    //sort circle areas (true for ascending, false for descending)
    public static void sortAreas(double[] areas, boolean ascending) {
        for (int i = 0; i < areas.length - 1; i++) {
            for (int j = i + 1; j < areas.length; j++) {
                if ((ascending && areas[i] > areas[j]) || (!ascending && areas[i] < areas[j])) {
                    double temp = areas[i];
                    areas[i] = areas[j];
                    areas[j] = temp;
                }
            }
        }
    }

    //displays the areas
    public static void displayAreas(double[] areas) {
        System.out.println("Circle Areas:");
        for (double area : areas) {
            System.out.println(area);
        }
    }

    //displays unique circle areas
    public static void displayUniqueAreas(double[] areas) {
        System.out.println("Unique Circle Areas:");
        boolean[] isDuplicate = new boolean[areas.length];

        for (int i = 0; i < areas.length; i++) {
            if (!isDuplicate[i]) {
                boolean foundDuplicate = false;
                for (int j = i + 1; j < areas.length; j++) {
                    if (areas[i] == areas[j]) {
                        isDuplicate[j] = true;
                        foundDuplicate = true;
                    }
                }
                if (!foundDuplicate) {
                    System.out.println(areas[i]);
                }
            }
        }
    }
}

