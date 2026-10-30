package Recursion;
import java.util.*;
public class PrintNum {
    //for 6, 5,4,3,2,1
//    public static void printNumb(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }
//
//    public static void main(String [] args){
//        int n = 6;
//        printNumb(n);
     //-----------------------------------------

    //For 1,2,3,4,5,6
    public static void printNumb(int n){
        if(n == 7){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    public static void main(String [] args){
        int n = 1;
        printNumb(n);
    }
}
