package Arrays;

//SPIRAL MATRIX
import java.util.*;

public class Spiral_Matrix {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int rows = scn.nextInt();

        System.out.print("Enter the column number : ");
        int cols = scn.nextInt();

        int[][] matrix = new int[rows][cols];

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;


        //For matrix input

        //rows
        for(int i = 0; i < rows; i++) {

            //columns
            for(int j =0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        //Print matrix

        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Spiral matrix

        System.out.println("Spiral Matrix is: ");

        while(top <= bottom && left <= right) {

            //Top row print
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            if (top <= bottom) {

                //Right COLUMN PRINT
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
            }
            right--;


            if (left <= right) {
                // bottom row print
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
            }
            bottom--;

            if (top <= bottom) {
                //LEFT COLUMN /PRINT
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
            }
            left++;
        }
    }
}
