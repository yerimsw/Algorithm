import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int m = b + c; // 최종 분
        int h = a + (m / 60); // 최종 시

        if (m >= 60) {  // 60분 초과 시
            m = m % 60;
            if (h >= 24) h = h % 24; // 24시 초과 시
        }

        System.out.println(h+" "+m);
    }
}
/**
 * 1. 현재시각 분+주어진 분 >= 60
 * 2. 현재시각 시+(분+주어진 분)/60 >= 24
 */
