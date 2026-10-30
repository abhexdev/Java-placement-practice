package Recursion;

public class powerLogn {
        public static int calcPower(int x, int n){
            if(n==0){
                return 1;
            }
            if( x == 0 ){
                return 0;
            }
            int half = calcPower(x , n/2);

            //if the power is even
            if(n % 2 == 0){
               return  half * half;
            }
            else {
                return half * half * x; // n is odd
            }
        }
        public static void main(String [] args){
            int x = 2, n = 5;
            long ans = calcPower(x,n);
            System.out.println(ans);
        }
    }
