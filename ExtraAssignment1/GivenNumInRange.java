package ExtraAssignment1;

import java.util.Scanner;

public class GivenNumInRange {
    public static void main(String[] args){
        boolean res = output();
        while(!res){
            res = output();
        }
    }
    public static boolean output(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = userInput.nextInt();
        if(n >= 0 && n < 10){
            System.out.println("Congrats, u r in");
            return true;
        }else{
            System.out.println("please, try again");
            return false;
        }
    }

}
