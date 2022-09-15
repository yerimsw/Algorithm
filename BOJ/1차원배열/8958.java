import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N >= 1) {
            String str = br.readLine();
            if(N==1) br.close();

            int res = 0;
            int score = 0;
            boolean flag = false;

            for (int i = 0; i < str.length(); i++) {
                if (flag) {  // 전 값이 O라면
                    if (str.charAt(i) == 'O') res += (++score); // 현재 값이 O라면
                    else {  // 현재 값이 X라면
                        flag = false;
                        score = 0;
                    }
                } else {  // 전 값이 X라면
                    if (str.charAt(i) == 'O') { // 현재 값이 O라면
                        res += (++score);
                        flag = true;
                    }
                }
            }
            System.out.println(res);
            N--;
        }
    }
}

// 1. 이전 값이 O라면 flag=true, X라면 false
// 2. flag가 true일 때 O->result += ++score;, X-> flag=false, score=0
// 3. flag가 false일 때 O->result += ++score
