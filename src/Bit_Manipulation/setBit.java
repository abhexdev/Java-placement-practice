package Bit_Manipulation;

public class setBit {
    public static void main(String [] args){


//        //  SETBIT
        int n = 5; // 0101  From right to left.
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
    }

