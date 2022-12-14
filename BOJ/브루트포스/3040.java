import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[9];
        int first=0;
        int second=0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(sum-(arr[i]+arr[j]) == 100) {
                    first=i;
                    second=j;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(i==first || i==second) continue;
            System.out.println(arr[i]);
        }
    }
}
