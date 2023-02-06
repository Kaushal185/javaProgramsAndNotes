package Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Arrays;
import java.util.TreeSet;

public class TwoDArrayList {

    public static void main(String[] args){

//        TreeSet<ArrayList<Integer>> s = new TreeSet<>();
//        s.add(new ArrayList<>(List.of(1,2,4)));
//        s.add(new ArrayList<>(List.of(1,2,4)));
//        s.add(new ArrayList<>(List.of(1,2,4)));
//        Iterator<ArrayList<Integer>> i = s.iterator();
//        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
//            while(i.hasNext()){
//                r.add(new ArrayList<>(i.next()));
//            }


        ArrayList<Integer> l = new ArrayList(List.of(1,3,2,7,5));
        System.out.println(l);

        Collections.sort(l);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println(l);

        int []a = {5,4,9,3,7,2};
        java.util.Arrays.sort(a);
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(a));


    }
}
