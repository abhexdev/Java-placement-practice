package Arrays;
                                        //Transpose matrix
import java.util.*;

public class Transpose{
    public static void main(String []args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter rows");
        int rows = scn.nextInt();
        System.out.println("Enter cols:");
        int cols = scn.nextInt();

        int matrix [][] = new int[rows][cols];

        //input
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        //print

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        //TRANSPOSE
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}

