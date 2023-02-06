package Arrays;

public class StairCaseRes {
    static int counter = 0;
    public static void main(String[] args){
        System.out.println(countWays(100));
        System.out.println(counter);
    }
    static int countWays(int n){
        counter++;
        if(n < 0) return 0;
        else if(n == 0) return 1;
        else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);

        }
    }
}
