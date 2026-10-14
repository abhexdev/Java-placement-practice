package Strings;

//Take an array of Strings input from the user & find the cumulative (combined)
// length of all those strings.


import java.util.*;
public class Cumulative_length {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + n + " strings:");
        //Alternate
//        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String [] arr =  new String[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextLine();
        }

        for(int i = 0; i < arr.length; i++){

            sum += arr[i].length();
        }

        System.out.println("Total character: "+sum);
    }
}
