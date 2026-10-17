package Bit_Manipulation;

public class getBit {

        public static void main(String [] args) {
//     GET BIT OPERATION.
        int n = 5; // 0101  From right to left.
        int pos = 2;
        int bitMask = 1 << pos;

        if(((bitMask & n) == 0)){
            System.out.println("0");

        } else
            System.out.println('1');

    }

}
