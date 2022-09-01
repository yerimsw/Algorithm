import java.util.Scanner;

public class Main {
    public static int fibo(int num) {
        if(num==0) return 0;
        if(num==1 || num==2) return 1;

	// num이 3이상일 때, 점화식을 이용
        return fibo(num-2)+fibo(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibo(n));
    }
}
