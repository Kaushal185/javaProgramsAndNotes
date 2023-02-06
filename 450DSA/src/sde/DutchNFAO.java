package sde;
import java.util.Arrays;
public class DutchNFAO {
    static int[] sortColors(int[] arr){
        int lo = 0;
        int hi = arr.length-1;
        for(int i=lo;i<=hi;){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[lo];
                arr[lo] = temp;
                lo++;i++;
            }
            else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2,0,1,2,0,1};
        int[] res = sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
