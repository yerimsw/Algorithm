import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n, k;
        int j=0;

        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i=1; i<=n; i++) queue.offer(i); // 0

        while(!queue.isEmpty()){    // 1
            for(int i=1;i<k;i++) queue.add(queue.poll()); // 2
            arr[j++]=queue.poll();  // 3
        }

        System.out.print("<");
        for(int i =0; i<n; i++) {   // 4
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(", ");
            else System.out.print(">"); // 5
        }
    }
}

// 0. 큐에 숫자 n 까지 1부터 차례대로 삽입
// 1. 큐가 빌 때까지 while 루프 돌면서
// 2. for 루프 k-1 만큼 돌면서 맨 앞 원소를 큐의 마지막에 삽입
// 3. k 번째가 되면, 맨 앞 원소를 제거하여 정답 배열에 삽입
// 4. 정답 배열을 순차대로 출력
// 5. 마지막이면 ", " 출력 안하고 ">" 출력하고 종료
