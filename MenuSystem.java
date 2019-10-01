import java.util.*;

public class MenuSystem {
    public static void main(String[] args){
        String[] arrMenu = {"Addera två tal(Add two numbers)", "Räkna bokstäver i en sträng(count occurance of a letter)",
                "Spegelvänd en sträng(Reverse a string)", "Summera alla tal i en sträng(Add all numbers in a string)","Avsluta(End the program)"};
        System.out.println("Hello! Welcome, U can choose the following any of the option to do something to the program");
        boolean res = true;
        while(res){
            menuItemsList(arrMenu);
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter user choice");
            String str = userInput.nextLine();

            if(str.trim().charAt(0) == 'e'){
                System.out.println("Hejdå!");
                res = false;
            }else{
                int n = Integer.parseInt(str);
                n= n-1;//Index purpose
                if(n<arrMenu.length-1) {
                    System.out.println(arrMenu[n]);
                }else{
                    System.out.println("ArrayIndexOutOfRange");
                }
                switch (n){
                    case 0:
                        addNumbers();
                        break;
                    case 1:
                        countOccurancesOfLetterInString();
                        break;
                    case 2:
                        reverseString();
                        break;
                    case 3:
                        sumOfAllNumsOfString();
                        break;
                    default:
                        break;
                }
            }
        }
    }
    public static void menuItemsList(String[] arrMenu){

        for(int i = 0;i< arrMenu.length;i++){
            if(i == arrMenu.length -1){
                System.out.println( "e."+ arrMenu[i]);
            }else {
                System.out.println(i+1 + "." + arrMenu[i]);
            }
        }
    }
    public static void addNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = input.nextInt();
        System.out.println("Enter second number");
        int n2 = input.nextInt();
        int sum = n1 + n2 ;
        System.out.println("Sum of the given two numbers is :" + sum);
    }
    public static  void countOccurancesOfLetterInString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a letter");
        char c = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.trim().charAt(i) == c) { //Character.isLetter(str.charAt(i))
                count++;
            }
        }
        System.out.println("Occurence of the given letter is : "+count);
    }
    public static void reverseString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is: " + rev);
    }
    public static void sumOfAllNumsOfString(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string with numbers");
        String str = userInput.nextLine();
        int n=0;
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(isDigit(c)){
                n = n + Character.getNumericValue(c);
            }else{
                n=0;
                System.out.println("The given string contains characters");
                break;
            }
        }
       if(n>0)
           System.out.println("Sum of all numbers in a string is:" + n);
    }
    public static boolean isDigit (char c){
        if( Character.isDigit(c)) {
            return true;
        }else{
            return false;
        }
    }
}
