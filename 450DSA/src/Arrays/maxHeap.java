package Arrays;
import java.util.*;
class Mycomp implements Comparator<Integer>{
    // so we are implementing interface so we need to override all the methods from it.
    // we need to make our call Mycomp abstract
    public int compare(Integer i1,Integer i2){
        if(i1<i2){
            return 1;
        }
        else if(i1>i2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class maxHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Mycomp());
        maxHeap.add(55);
        maxHeap.add(45);
        maxHeap.add(15);
        maxHeap.add(25);
        maxHeap.add(40);
        maxHeap.add(35);
        System.out.print(maxHeap.peek());
    }
}
