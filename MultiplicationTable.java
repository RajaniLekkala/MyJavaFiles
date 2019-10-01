import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number:");
        int input = userInput.nextInt();
        multiTable(input);
    }
    public static void multiTable(int x){
        System.out.println("Multiplication of " + x + " is:");
        for(int i=1;i<=10;i++){
            System.out.println(x*i);
        }
    }
}
