import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        
        int foreEnd = 0; // 이전 회의 끝 시각
        int p = 0; // 현재 회의를 가리키는 arr인덱스 포인터
        int cnt = 0; // 회의 가능 횟수

        for(int i=0; i<n; i++) {
            if(arr[p][0] >= foreEnd) { // 현재 회의 시작시각이 이전 회의 끝시각보다 같거나 크면
                foreEnd = arr[p][1];
                cnt++;
            }
            p++; // 다음으로 가장 빨리 끝나는 회의 가리킴
        }
        System.out.println(cnt);
    }
}
