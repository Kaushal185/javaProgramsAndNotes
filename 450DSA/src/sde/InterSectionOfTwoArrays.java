package sde;
import java.util.*;
import java.util.Collections;
public class InterSectionOfTwoArrays {
    static ArrayList<Integer> intersection(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
       // HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
        }
//        for(int j=0;j<b.length;j++){
//            set2.add(b[j]);
//        }
        for(int i =0;i<b.length;i++){
            if(set1.contains(b[i])){
                list.add(b[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] a = {1,1,2,4,5};
        int[] b = {3,3,4,5,6};
        System.out.println(intersection(a,b));
    }
}
