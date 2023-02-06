package Arrays;
import java.util.*;
public class HashTableImplementation {
    static boolean binarySearch(int[] a,int key){
        int s = 0;
        int e = a.length -1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(a[mid] == key) return true;
            else if(a[mid] < key) s++;
            else e--;
        }
        return false;
    }
    static void doUnion(int[]a,int[]b){
        if(a.length>b.length){
            int[] temp =a;
            a = b;
            b = temp;
        }
        Arrays.sort(a);
        for(int x:a){
            System.out.print(x+" ");
        }
        for(int i=0;i<b.length;i++){
            if(!binarySearch(a,b[i])){
                System.out.print(b[i]+" ");
            }
        }

    }
    static void doIntersection(int[] a,int[] b){
       // ArrayList<Integer>list = new ArrayList<>();
        HashSet<Integer>h = new HashSet<>();
        HashSet<Integer>t = new HashSet<>();
        for(int x:a){
            h.add(x);
        }
        for(int x:b){
            t.add(x);
        }
        System.out.println(h);
        System.out.println(t);
        for(int x:h){
           if(t.contains(x)){
               System.out.print(x+" ");
           }
        }
        //liner time complexity intersection of 2 arrays

    }
    public static void main(String[] args){
          int[] a = {2,3,4,5,9};
          int[] b = {1,3,10,9,7};
          doIntersection(a,b);
          System.out.println();
          doUnion(a,b);
      //    System.out.println(list);
//        String str = "Helo";
//        System.out.println(isUnique(str));
//        Hashtable ht = new Hashtable();
//        ht.put(1,"A");
//        ht.put(2,"B");
//        System.out.println(ht);
//        String s = (String)ht.get(ht);
//        ArrayList<Integer>list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        System.out.println(list.get(0));
//        HashSet<Integer>hs = new HashSet<>();
//        TreeSet<Integer>ts = new TreeSet<>();
//        HashMap<Integer,String>hm = new HashMap<>();
//        hm.put(30,"a");
//        hm.put(50,"b");
//        ts.add(30);
//        ts.add(40);
//        System.out.println(ts);
//        hs.add(10);
//        hs.add(20);
//        hs.add(30);
//        System.out.println(hs);
//        Iterator<Integer>it = hs.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }


    }
}
