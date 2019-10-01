import java.util.Scanner;

public class loopConcepts {
    public static void main(String[] args) {

       /* System.out.println("Using break statement");
        for(int i= 40; i> 0 ; i --) {
            System.out.println(i);
            if(i <= 30) {
                break;
            }

        }

        System.out.println("****using condition********");
        for(int i= 40; i>= 30 ; i --) {
            System.out.println(i);

        }

        System.out.println("Even number from 2 to 12");

        for(int i = 2; i<13; i = i+2) {
            System.out.println(i);

        }

*/

       Scanner userInput = new Scanner(System.in);
       System.out.println("what is ur age?");
       int age = userInput.nextInt();
       System.out.println("My age is :" +age);

    }

}
