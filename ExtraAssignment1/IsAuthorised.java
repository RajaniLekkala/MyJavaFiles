 import java.util.ArrayList;
import java.util.Scanner;

public class IsAuthorised {
    public static void main(String[] args){
        int loginAttempts = 0;
        int c1=0, c2=0,c3=0;
        Scanner userInput = new Scanner(System.in);
        while(loginAttempts < 5) {
            System.out.println("Enter password");
            String inputPwd = userInput.next();
            loginAttempts++;
            if(inputPwd.equals("snuff")){
                c1++;
            }
            if(inputPwd.equals("puff")){
                c2++;
            }
            if(inputPwd.equals("piggy")){
                c3++;
            }
            if((loginAttempts == 3) || (loginAttempts == 4) ){
                if((c1 == 1) && (c2 == 1) && (c3 == 1)){
                    System.out.println("Congrats, U entered all three passwords are correct");
                    break;
                }else{
                    System.out.println("please, try again");
                }
            }else if((loginAttempts == 5)){
                if((c1 == 1) && (c2 == 1) && (c3 == 1)){
                    System.out.println("Congrats, U entered all three passwords are correct in the last attempt");
                }else{
                    System.out.println("sorry, u did not entered all three passwords correct");
                }
            }
        }
    }
}
