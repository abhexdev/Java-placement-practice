package StringBuilder;
import java.util.*;

public class UsernameSb {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < email.length(); i++){

            char ch = email.charAt(i);

            if(ch == '@'){
                break;
            }
            else
                sb.append(ch);
        }
        System.out.println(sb);
    }
}
