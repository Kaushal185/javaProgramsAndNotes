package sde;
import java.util.Arrays;
public class MoveAllNegToOneSide_O {
    static int[] moveNeg(int[] arr){
        int lo =0;
        int hi = arr.length-1;
        for(int i=0;i< hi;){
            if(arr[i] >=0){
                int temp = arr[i];
                arr[i] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
            else if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[lo];
                arr[lo] = temp;
                i++;
                lo++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        // can i used dutch national flag algorithm
        int[] arr = {-1,2,-3,4,5,-7};
        System.out.println(Arrays.toString(moveNeg(arr)));
    }
}
