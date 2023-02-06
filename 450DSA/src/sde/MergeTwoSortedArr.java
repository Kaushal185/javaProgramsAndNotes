package sde;
import java.util.Arrays;
public class MergeTwoSortedArr {
    static int[] merge(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int i = 0,j = 0,k = 0;
        int[] res = new int[m+n];
        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                res[k++] = arr1[i++];
            }
           else{
                res[k++] =arr2[j++];
            }
        }
        while(i<m){
            res[k++] = arr1[i++];
        }
        while(j<n){
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,4};
        int[] arr2 = {2,3,4};
        int[] res = merge(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
