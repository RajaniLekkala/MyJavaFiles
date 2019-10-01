import java.util.Scanner;
public class MeanOfTwoNumbers {
    public static void main(String[] args){
 /*     Scanner sn1 = new Scanner(System.in);
        Scanner sn2 = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int n1 = sn1.nextInt();
        System.out.println("Enter second integer:");
        int n2  = sn2.nextInt();*/

        int n1 = getNumber();
        int n2= getNumber();
        int sum = n1 + n2;

        double mean = (double)sum / 2;
        System.out.println("Mean of " + n1 + " & " + n2 + " is: " + mean);
    }
    public static int getNumber(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = userInput.nextInt();
        return n;
    }
}
