package Bit_Manipulation;
import java.util.*;

public class ones_Binary {
    public static void main(String []args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;

        while ( n > 0){
            if ((n & 1) == 1) {
                count++;
            }
                n = n >> 1;
        }
        System.out.println(count);
    }
}
