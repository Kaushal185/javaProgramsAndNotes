package sde;
import java.util.Arrays;
public class MoveAllNegToOneSide {
    static int[] moveNeg(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] >= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else if(arr[j] < 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {-1,2,-3,4,5,-7};
        System.out.println(Arrays.toString(moveNeg(arr)));
    }
}
