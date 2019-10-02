package MockUpLab;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args){
        char[] alphaChars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to display number of alphabets:");
        int n= userInput.nextInt();
        String strComma = "";
        for(int i=0;i<n;i++){
           strComma = strComma + alphaChars[i] + ",";
        }
        strComma = strComma.substring(0, strComma.length() - 1);
        System.out.println(strComma);
    }
}
