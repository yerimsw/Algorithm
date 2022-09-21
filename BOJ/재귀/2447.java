import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        arr = new char[N][N];

        recur(0,0, N, false);

        StringBuilder sb = new StringBuilder();
        for (char[] c1 : arr){
            for(char c2 : c1) {
                sb.append(c2);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static char[][] arr;

    //size: 한 블럭 당 크기 (N이 27일 때 size는 9)
    static void recur(int x, int y, int N, boolean flag){

        if(flag) { // 공백
            for(int i=x ; i <x+N ; i++) {
                for(int j=y ; j<y+N ; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(N==1){ // 나 자신이 1일 때 = 더 이상 쪼갤 수 없을 때
            arr[x][y] = '*';
            return;
        }

        int cnt=0;
        int size = N / 3;
        for(int i=x; i < x+N; i+=size){ // x가 자신의 크기보다 넘으면 안됨, 나/3 크기 만큼 좌표 이동
            for(int j=y ; j < y+N; j+=size) { // y가 자신의 크기보다 넘으면 안됨, 나/3 크기 만큼 좌표 이동
                cnt++;  // 공백 블럭을 찾기위한 변수
                if(cnt==5) recur(i,j,size,true); // 공백 블럭 O (size = N/3, 분할하여 재귀한다)
                else recur(i,j,size,false); // 공백 블럭 X
            }
        }
    }
}
// 1. 크기와 사이즈(크기/3)를 3으로 나누어 가며, 더이상 쪼갤 수 없을때(크기가 1일때) *을 배열에 저장한다.
// 2. 가로 세로를 3으로 나누어 9개로 쪼갰을 때, 5번째 박스가 공백이어야 한다.
// 3. 상자의 왼쪽 상단 좌표(1,1)를 기준으로, 상자 사이즈 만큼 좌표를 이동시켜야 한다.
// 4. 이때, 상자 좌표가 상자사이즈 * 3을 넘어가면 안된다.
