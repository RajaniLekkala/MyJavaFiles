import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = userInput.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n){
        int a = 1;
        int b = 1;
        int c ;

        for(int i=1;i<=n;i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }

    }
}
