package Bit_Manipulation;
import java.util.*;

public class UpdateBit {
    public static void main(String [] args){
        //UPDATE BIT (O TO 1; OR 1 TO 0;)
        Scanner sc = new Scanner(System.in);

        int operation = sc.nextInt(); //operation == 1; setBit or Operation == 0; updatebit
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;

        //SetBit
        if(operation == 1){

            int newNum = bitMask | n;
            System.out.println(newNum);

        }
        else {

            int newBitMask = ~(bitMask);
            int newNum = newBitMask & n;
            System.out.println(newNum);
        }

        }
}
