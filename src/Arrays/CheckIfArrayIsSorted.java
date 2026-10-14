package Arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int nums[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            nums[i] = scn.nextInt();
        }
        int flag= Integer.MIN_VALUE;
        boolean check = true;
        for (int i=0;i<nums.length;i++){
            if (flag == Integer.MIN_VALUE){
                flag=nums[i];
            }
            else{
                if(nums[i]>flag){
                    flag=nums[i];
                }
                else{
                    check= false;
                    break;
                }
            }
        }
        if(check){

            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
