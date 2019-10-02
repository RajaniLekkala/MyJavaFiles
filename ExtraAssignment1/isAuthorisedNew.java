package ExtraAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class isAuthorisedNew {
    public static void main(String[] args){
        isAuthorized();
    }
    public static void isAuthorized(){
        int loginAttempts =5;
        Scanner userInput = new Scanner(System.in);
        String[] pwd = new String[]{"piggy","puff","snuff"};
        while(loginAttempts<=5){

            System.out.println("Enter 1st pwd");
            String p1= userInput.next();
            System.out.println("Enter 2nd pwd");
            String p2= userInput.next();
            System.out.println("Enter 3rd pwd");
            String p3= userInput.next();
            String[] userInputPwd = new String[]{p1,p2,p3};

            if(Arrays.asList(userInputPwd).containsAll(Arrays.asList(pwd))){
                System.out.println("U entered all three passwords are correct");
                break;
            }else{
                System.out.println("sorry,please try again");
            }
        }
    }
}
