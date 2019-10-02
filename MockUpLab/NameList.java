package MockUpLab;

import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    ArrayList<String> arrList;
    public static void main(String[] args){
        String[] strNames = listOfName();
        int i = 0;
        while(i<strNames.length){
            insertNewName(strNames[i]);
            i++;
        }
    }
    public static void insertNewName(String strName){

    }
    public static void printNameList(){

    }
    public static String[] listOfName(){
        String[] strArrNames= new String[5];
        String str = "";
        Scanner userInput = new Scanner(System.in);
        for(int i=0;i<strArrNames.length;i++){
            System.out.println("Enter a name");
            str = userInput.next();
            strArrNames[i] = str;
        }
        return strArrNames;
    }
}
