import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] res = new int[3];

        res[0] = n1 * (n2 % 10);
        System.out.println(res[0]);

        res[1] = n1 * ((n2 % 100) / 10);
        System.out.println(res[1]);

        res[2] = n1 * (n2 / 100);
        System.out.println(res[2]);

        System.out.println(res[0] + res[1] * 10 + res[2] * 100);
    }
}

// 1. 3: (2의 1의자리) x 1
// 2. 2: (2의 10의자리) x 1
// 3. 1: (2의 100의자리) x 1
