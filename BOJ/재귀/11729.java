import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    static void hanoi(int N, int st, int to, int via){
        cnt++;
        if(N==1) sb.append(st+" "+to+"\n");
        else{
            hanoi(N-1,st,via,to);
            sb.append(st + " " + to+"\n"); // N번째 원판이 st -> to 로 옮겨짐
            hanoi(N-1,via,to,st);
        }
    }

    public static void main(String[]args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();

        hanoi(n,1,3,2);
        System.out.println(cnt);
        System.out.print(sb);
    }
}
