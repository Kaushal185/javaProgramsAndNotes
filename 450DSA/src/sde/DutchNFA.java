package sde;
import java.util.Arrays;
public class DutchNFA {
    static int[] sortColors(int []arr){
        int l = 0,m = 0,n = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                l++;
            }
            else if(arr[i] == 1){
                m++;
            }
            else{
                n++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<l){
                arr[i] = 0;
            }
            else if(i>=l && i< m+l){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
        }
        return arr;

    }
    public static void main(String[] args){
        int[] arr = {2,1,2,0,2,1,1,0};
        int[] res = sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
