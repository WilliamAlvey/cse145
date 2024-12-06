//William ALvey
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
      
        Scanner key = new Scanner(System.in);
        
        // enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = key.nextInt();
        
        //the top half of the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++)
            
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //the bottom half of the triangle
        for (int i = height - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) 
            
            {
                System.out.print("*");
            }
            System.out.println();
        }

 
        System.out.println("End of program!");
        key.close();
    }
}
