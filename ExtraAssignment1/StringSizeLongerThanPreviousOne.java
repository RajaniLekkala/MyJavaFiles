package ExtraAssignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSizeLongerThanPreviousOne {
    public static void main(String[] args){
        boolean res = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = userInput.next();
        ArrayList<String> arrStrings = new ArrayList<String>();
        arrStrings.add(s1);
        while(res){
            System.out.println("Enter a string");
            String s2 = userInput.next();
            arrStrings.add(s2);
            if(s2.length() <= s1.length()){
                System.out.println("Entered strings are: "+arrStrings);
                res= false;
            }
            s1=s2;
        }
    }
}
