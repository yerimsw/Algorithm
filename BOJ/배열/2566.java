import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[9][9];
        int max = 0;
        int xIdx = 0;
        int yIdx = 0;
        
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j=0;
            
            while(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                if(num >= max) {
                    max = num;
                    xIdx=i;
                    yIdx=j;
                }
                j++;
            }
        }
        br.close();
        
        System.out.println(max);
        System.out.println((xIdx+1) + " " + (yIdx+1));
    }
}
// 1. 9x9 배열을 선언
// 2. for문으로 값을 받으며 최대값일 때의 i,j를 저장하기.
// 3. 최대값의 좌표 출력하기
