package Bit_Manipulation;
import java.util.*;

public class binaryDecimalConversion {

    public static void decimalToBinary(int num1){
        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        while(num1 > 0){
            remainder = num1 % 2;
            sb.append(remainder);
            num1 = num1 / 2;
        }
        System.out.println(sb.reverse());
    }

    public static void binaryToDecimal(int num2){
        int decimal = 0;
        int power = 0;
        int digit;

        while(num2 > 0){
            digit = num2 % 10;
            decimal += digit * Math.pow(2,power);
            num2 = num2 / 10;
            power++;
        }
        System.out.println(decimal);
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to convert decimal to binary: ");
        int num1 = sc.nextInt();
        decimalToBinary(num1);

        System.out.println("Enter a number to convert decimal to binary: ");
        int num2 = sc.nextInt();
        binaryToDecimal(num2);
    }
}
