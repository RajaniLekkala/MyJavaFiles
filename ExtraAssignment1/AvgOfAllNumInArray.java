import java.util.Arrays;
public class AvgOfAllNumInArray {
    public static void main(String[] args){
        int[] arrAvg = new int[5];
        for(int i=0;i<5;i++ ){
            arrAvg[i] = i+2 ;
        }
        double avg = calAvg(arrAvg,arrAvg.length);
        System.out.println(("Avg of all numbers of given array is: "+ avg));
    }
    public static double calAvg(int[] arrAvg,int count){
        int sum = 0;
        for(int i=0;i<count;i++){
            sum = sum + arrAvg[i];
        }
        return sum/count;
    }
}