import java.util.*;
public class ArrayConcepts {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter x value:");
        // Create an array
        int[] arrToGet = CreateArray(userInput.nextInt());
        // To print an array
        System.out.println(("firstArray"));
        printArray(arrToGet);
        //doubleUpArray
        int[] doubleArray = doubleUpArray(arrToGet);
        System.out.println(("doubleUPArray"));
        printArray(doubleArray);
    }
    public static int[] CreateArray(int x){
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = i;
        }
        return arr;
    }
    public static void printArray(int[] arrPrint){
        for(int i=0;i< arrPrint.length;i++){
            System.out.println(arrPrint[i] );
        }
    }
    public static int[] doubleUpArray(int[] arrfirst) {
        int len = arrfirst.length;
        int newLength = 2 * len ;
        int[] newArray = new int[newLength];
        for(int i=0; i<len;i++){
            newArray[i] = arrfirst[i];
        }
        return newArray;
    }
}
