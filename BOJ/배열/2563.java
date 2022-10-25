import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        int chk=0;

        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if(!arr[y+i][x+j]) {
                        arr[y+i][x+j] = true;
                        chk++;
                    }
                }
            }
        }
        br.close();
        System.out.println(chk);
    }
}
// 1. 2차원 배열을 선언한다.
// 2. 색종이가 칠해진 좌표에서 부터 10칸씩을 체크한다.
// 3. (2)과정 중 안칠했던 좌표에 대해 칸수를 체크하는 변수 chk을 ++한다.
