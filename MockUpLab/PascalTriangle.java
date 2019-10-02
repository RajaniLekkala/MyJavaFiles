package MockUpLab;

import java.util.Scanner;

public class PascalTriangle  {

/*    Algorithm
1. Take a number of rows to be printed, n.
2. Make outer iteration I for n times to print rows.
3. Make inner iteration for J to (N - 1).
4. Print single blank space " ".
5. Close inner loop.
6. Make inner iteration for J to I.
7. Print nCr of I and J.
8. Close inner loop.
9. Print NEWLINE character after each inner iteration.*/

    public static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    public static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String args[]){
        System.out.println();
        int n, i, j;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number for number of rows to be displayed..");
        n = userInput.nextInt();

        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
    }

}
