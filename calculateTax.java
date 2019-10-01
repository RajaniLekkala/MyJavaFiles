import java.util.*;
public class calculateTax {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter salary:");
        int sal = userInput.nextInt();
        double tax= calTax(sal);
        System.out.println("Tax for the given salary is:" + tax);
    }
    public static double calTax(int salary){
        double tax;
        if(salary > 100000) {
            tax =  salary * 0.4;
        }else {
            tax = salary * 0.3;
        }
        return tax  ;
    }
}
