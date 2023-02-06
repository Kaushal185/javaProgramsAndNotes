package Arrays;
import java.util.*;
public class UniqueString {
    static boolean isUniqueM0(String str){
        HashSet<Character>h = new HashSet<>();
        for(int i=0;i<str.length();i++){
            h.add(str.charAt(i));
        }
        if(str.length() == h.size()) return true;
        else return false;
    }
    static boolean isUniqueM1(String str){
        //TC : O(N^2) SC:O(1)
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isUniqueM2(String s){
        //TC:NlogN
        char[] arr = s.toCharArray();
        Arrays.sort(arr);// TC : NlogN
        //System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){//TC N
            if(arr[i] == arr[i+1]){
                return false;
            }
        }

        return true;
    }
    static boolean isUniqueM3(String str){
        if(str.length() > 128){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    static boolean isUniqueM4(String str){
        //TC O(n)
        //SC O(1)
        //Method 4 is only true if our string is consist of only a to z lowercase charaters
        int checker = 0;
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i) - 'a';
            if((checker & 1<<val) > 0){
                return false;
            }
            checker |= 1<<val;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "Helo";
        System.out.println("Method 1 "+isUniqueM1(str));
        System.out.println("Method 2 "+isUniqueM2(str));
        System.out.println("Method 3 "+isUniqueM3(str));
        System.out.println("Method 0 "+isUniqueM0(str));
        System.out.println("Method 4 "+isUniqueM4(str));
//        char c = 'a';
//        int a = c <<1;
//        System.out.println((int)c);
//        System.out.println(a);
//        System.out.println('h'-'a');
//        System.out.println(1<<7);
    }
}
