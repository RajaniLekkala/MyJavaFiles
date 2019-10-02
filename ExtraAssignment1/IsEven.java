package ExtraAssignment1;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = userInput.nextInt();
        boolean res = isEven(n);
        if(res == true){
            System.out.println("The given number is Even number");
        } else{
            System.out.println("The given number is not a Even number");
        }
    }
    public static boolean isEven(int n){

        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
