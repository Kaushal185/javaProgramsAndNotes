package sde;
import java.util.*;
public class UnionOfusingHashMap {
    static void union(int[] a,int[] b){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }
        for(int j=0;j<b.length;j++){
            map.put(b[j],j);
        }
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
    public static void main(String[] args){
        int[] a = {1,1,2,4,5};
        int[] b = {3,3,4,6};
        union(a,b);
    }
}
