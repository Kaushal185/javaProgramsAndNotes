package Arrays;

public class Fibo {
    static long fibo(int n){
    if(n <= 1) return n;
    long a = 0;
    long b = 1;
    for(int i=2;i<n;i++){
        long c = a+b;
        a = b;
        b = c;
    }
    return a+b;

    }
    public static void main(String[] args){
        System.out.println(fibo(100));
    }
}
