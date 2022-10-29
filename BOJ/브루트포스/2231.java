import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for(int i=1; i<=n; i++) {
            int sum = i;
            int tmp = i;

            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if(sum == n) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
// 1 부터 n 까지 각 자리수 합을 구해 n과 같아지는 수를 찾는다.
