import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int j=0;
            while(st.hasMoreTokens()){
                arr[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int j=0;
            while(st.hasMoreTokens()){
                arr[i][j] += Integer.parseInt(st.nextToken());
                if(j == 0) bw.write(String.valueOf(arr[i][j]));
                else bw.write(" "+arr[i][j]);
                j++;
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
// 1. nxm 배열을 생성한다.
// 2. 행렬 A값을 nxm 배열에 저장한다.
// 3. 행렬 B값을 nxm 배열에 더한다.
