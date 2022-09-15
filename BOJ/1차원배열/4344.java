import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        while(C>=1){
            int sum = 0;

            String str = br.readLine();
            if(C==1) br.close();

            StringTokenizer st = new StringTokenizer(str);
            int num = Integer.parseInt(st.nextToken()); // 사람 인원 수 num
            int[] arr = new int[num];
            int idx=0;

            while(st.hasMoreTokens()){ // num 만큼 돌면서 arr에 점수 삽입
                arr[idx] = Integer.parseInt(st.nextToken());
                sum += arr[idx++]; // 평균 산출을 위한 sum
            }

            int avg = sum / num; // 평균
            int cnt = 0;
            for(int i : arr) if(i>avg) cnt++; // 평균을 넘는 인원 cnt

            System.out.printf("%.3f%%%n",(double)cnt/(double)num*100); // 평균을 소수점 3째자리까지 출력
            C--;
        }
    }
}
// 1. c만큼 while 문을 돌면서
// 2. num 만큼 arr 배열에 삽입, sum 값 더하기
// 3. avg=(sum/num) 보다 큰 arr[i] 수 cnt 세기
// 4. cnt/num * 100 출력하기
