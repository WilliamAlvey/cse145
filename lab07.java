// William Alvey

import java.util.Scanner;

public class lab07 { 
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //  for matrix rows and columns
        System.out.println("Enter the number of rows for the matrices: ");
        int rows = key.nextInt();
        System.out.println("Enter the number of columns for the matrices: ");
        int cols = key.nextInt();

   
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Input for the first matrix with coordinates
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix 1 at (" + i + "," + j + "): ");
                matrix1[i][j] = key.nextInt();
            }
        }

        // Input for the second matrix with coordinates to make it easy to tell where the input will be
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Matrix 2 at (" + i + "," + j + "): ");
                matrix2[i][j] = key.nextInt();
            }
        }

        // Adds both matrices and store the result in sumMatrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the matrices and their sum 
        System.out.println("\nMatrix 1 + Matrix 2 = Sum:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print the first matrix
                System.out.print(matrix1[i][j] + " ");
            }

            if (i == rows / 2) { // Centers the '+' and '=' symbols
                System.out.print(" +  ");
            } else {
                System.out.print("    ");
            }

            for (int j = 0; j < cols; j++) {
                // Print the second matrix
                System.out.print(matrix2[i][j] + " ");
            }

            if (i == rows / 2) { // Centers the '=' symbol in the middle row
                System.out.print(" =  ");
            } else {
                System.out.print("    ");
            }

            for (int j = 0; j < cols; j++) {
                // Print the sum matrix
                System.out.print(sumMatrix[i][j] + " ");
            }

            System.out.println();  
        }

        key.close(); 
    }
}

