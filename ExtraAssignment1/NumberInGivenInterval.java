package ExtraAssignment1;

import java.util.ArrayList;
import java.util.Scanner;
public class NumberInGivenInterval {
    public static void main(String[] args){
        boolean res = inputGiven();
        Result(res);
    }
    public static void Result(boolean res){
        if(res == true){
            System.out.println("Congrats, u r in");
        }else{
            System.out.println("Sorry, try again");
            boolean res1 = inputGiven();
            Result(res1);
        }
    }
    public static boolean inputGiven(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = userInput.nextInt();
        boolean res = isInRange(n);
        return res;
    }
    public static boolean isInRange(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>(11);
        for(int i=0;i<=10;i++){
            arr.add(i);
        }
        if(arr.contains(n)){
            return true;
        }else{
            return false;
        }

    }
}
