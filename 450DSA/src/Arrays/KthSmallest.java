package Arrays;
import java.util.*;
public class KthSmallest {
    static int Kthmin(int[]arr,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            heap.add(arr[i]);
        }
        int m;
        for(int i=0;i<k-1;i++){
            heap.poll();
        }
        return heap.peek();
    }
    public static void main(String args[]){
        int[] arr = {7,10,4,20,15};
        int min = Kthmin(arr,1);
        System.out.println(min);
    }
}
