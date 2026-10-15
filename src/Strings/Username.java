package Strings;
import java.util.*;

public class Username {
    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);

        String email = scn.nextLine();
        String username = "";

        for(int i = 0; i < email.length(); i++){
            char ch = email.charAt(i);

            if(ch == '@'){
                break;
            } else
                username += ch;
        }
        System.out.println(username);
    }
}
