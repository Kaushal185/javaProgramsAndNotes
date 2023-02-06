package Arrays;
import java.util.*;
public class PriorityQ {

    public static void main(String args[]){
        // PriorityQueue not sort elements its only min value comes uppper
        // like that . working is min heap or max heap
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>(List.of(4,5,3,1,9,6,7,8,2));
        ArrayList<Integer> arr = new ArrayList<>(List.of(4,5,3,1,9,6,7,8,2));
       // Iterator<Integer>it = arr.iterator();
//        System.out.println(it.next());
//        for(Integer x:arr){
//            System.out.print(x+" ");
//        }
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
        pQueue.addAll(arr);
        pQueue.poll();
        pQueue.poll();
        pQueue.poll();
        Iterator<Integer>it = pQueue.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
//        pq.add(100);
//        pq.add(80);
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        System.out.print(pq.peek());


    }
}
