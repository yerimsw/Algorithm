import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int answer = 0;
            int lft = 0, rgt = n - 1;
            int x = sc.nextInt();
            while (lft <= rgt) {
                int mid = (lft + rgt) / 2;
                if (a[mid] == x) {
                    answer = 1;
                    break;
                }
                if (a[mid] > x) rgt = mid - 1;
                else lft = mid + 1;
            }
            System.out.println(answer);
        }
    }
}
