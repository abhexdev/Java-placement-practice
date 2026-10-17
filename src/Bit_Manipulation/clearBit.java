package Bit_Manipulation;

public class clearBit {
    public static void main(String [] args){
    //CLEAR BIT
        int n = 5; // 0101  From right to left.
        int pos = 2;
        int bitMask = ~(1 << pos);

        int newNum = bitMask & n;
        System.out.println(newNum);

    }

}
