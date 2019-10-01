
import java.util.ArrayList;
import java.util.Scanner;

public class UserInputTextStringTwice {
    public static void main(String[] args){
        boolean result= true;

        //ask 1st time
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a text");
        String str1 = userInput.next();
        System.out.println("U have entered  " +str1);

        while(result){
            System.out.println("Enter a text");
            String str2 = userInput.next();
            System.out.println("U have entered  " + str2);

            if(str1.equals(str2)){
                System.out.println("U have entered '" + str2 +  "' twice");
                result = false;
            }
            str1 = str2;
        }
    }
}
