package Arrays;
import java.util.Arrays;
public class CheckPermutation {
    static boolean permutation(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return s1.equals(s2);
//        for(int i=0;i<arr1.length;i++){
//            if(arr1[i] != arr2[i]){
//                return false;
//            }
//        }
//        return true;
    }
    public static void main(String[] args){
        String s1,s2;
        s1 = new String("abcd");
        s2 = "abcv";
        System.out.println(permutation(s1,s2));
    }
}
