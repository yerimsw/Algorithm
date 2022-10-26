import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        mod = sc.nextLong();
        
        System.out.println(pow(a,b));
    }
    
    public static long mod;
    
    public static long pow(long base, long exponent){
        if(exponent == 1) return base % mod;
        else {
            long res = pow(base, exponent/2);
            if(exponent%2 == 0) return ((res%mod) * (res%mod)) % mod;
            else return ((((res%mod) * (res%mod))%mod) * (base%mod)) % mod;
        }
    }
}
// 1. (A * B) % C = ((A%C) * (B%C)) %C 를 이용한다.
// 2. A^n = A^(n/2) * A^(n/2) 를 이용한다.
