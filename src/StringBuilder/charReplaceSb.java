package StringBuilder;
import java.util.*;

public class charReplaceSb {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch == 'a'){
                sb.setCharAt(i , 'u');
            }
        }

        System.out.println(sb);

    }
}
