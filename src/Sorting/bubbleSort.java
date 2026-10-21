package Sorting;
import java.util.*;

public class bubbleSort {
    public static void printArr(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
    }
    //Time complexity = O(n ^ 2)
    public static void main(String [] args){

        int arr[] = {2,5,1,3,8};

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }
}
