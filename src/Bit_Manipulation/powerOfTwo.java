package Bit_Manipulation;
import java.util.*;

public class powerOfTwo {
    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        if((n & n-1) == 0){

            System.out.println(n +" is the power of 2.");

        } else

            System.out.println("Not the power of 2");

    }
}
