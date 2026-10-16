package StringBuilder;
import java.util.*;

public class cumulativeLength {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String [] strArr = new String[n];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            strArr[i] = sc.nextLine();
            sb.append(strArr[i]);
        }
        System.out.println("The length of all strings: "+sb.length());
    }
}
