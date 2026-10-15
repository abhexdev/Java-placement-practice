package Strings;
import java.util.*;

public class CharReplace {
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'e'){
                result += 'i';
            } else
                result += str.charAt(i);

        }
        System.out.println(result);

        //direct method ----> System.out.println(str.replace('e', 'i'));

    }
}
