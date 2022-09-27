import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int N = scanner.nextInt(); // 동전 종류 수
        int K = scanner.nextInt(); // 목표 금액
        int[] arr = new int[10];
        
        for(int i=0; i<N; i++) {   // 동전 값을 N개 받는 배열
            arr[i] = scanner.nextInt();
        }
        
        int p = N-1; // 동전 배열에서 현재 동전 가치를 가리키는 포인터
        int cnt = 0; // 필요 동전의 갯수
        
        while(K>0) {
            int curCoin = arr[p]; // 현재 동전의 가치
            if(K/curCoin > 0) {
                int count = K/curCoin; // 현재 동전 사용가능 갯수
                K -= curCoin*count; // K에서 해당 값 만큼 차감
                cnt += count; // 동전 개수 추가
            }
            else { // 현재 동전 값 > K 인 경우
                p--;
            }
        }
        System.out.println(cnt);
    }
}
