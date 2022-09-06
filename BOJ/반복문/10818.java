import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int max, min;
        max = sc.nextInt();
        min = max; // max와 min을 첫 번째 숫자 값으로 초기화
        n--;

        while(n>0){ // n개의 숫자 입력 받으면서 max와 min을 갱신
            int num = sc.nextInt();
            if(num>=max) max=num;
            else if(num<=min) min=num;
            n--;
        }

        System.out.println(min + " " + max);
    }
}
