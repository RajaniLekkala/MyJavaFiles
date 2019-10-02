import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        int[] arr = new int[]{2,7,4,9,12};
        System.out.print("Array before sorting ");
        for (int i=0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //sortArray(arr);
        bubbleSortArray(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
    public static void sortArray(int[] arr1){
        System.out.println("Array before sorting");
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        Arrays.sort(arr1);
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void bubbleSortArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
