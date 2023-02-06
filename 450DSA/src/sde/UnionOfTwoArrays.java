package sde;
import java.util.*;
public class UnionOfTwoArrays {
    static void union(int[] a,int[] b){
        HashSet<Integer> set = new HashSet<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            set.add(a[i]);
            set.add(b[j]);
            i++;
            j++;
        }
        while(i<a.length){
            set.add(a[i++]);
        }
        while(j<b.length){
            set.add(b[j++]);
        }
        Iterator<Integer>it = set.iterator();
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
