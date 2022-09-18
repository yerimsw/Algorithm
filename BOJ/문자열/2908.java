// 여러개의 숫자(자릿수 상관 없이)에 대한 상수의 대답
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int changeNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0 ; i--) sb.append(str.charAt(i));
        return Integer.parseInt(sb.toString()); // sb값을 int형으로 변환하여 리턴
    } // 주어진 숫자를 거꾸로 변환해 int 숫자로 반환하는 메서드

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(str); // 토큰으로 각 숫자 자름

        int max = 0;
        while(st.hasMoreTokens()){
            int n = changeNum(st.nextToken());
            if(n>max) max=n;
        }

        System.out.println(max);
    }
}
// 1. 각 숫자를 토큰으로 잘라, 각 토큰에 대해 str.length()-1부터 0까지 str.charAt(i)으로 스트링빌더에 append 한다.
// 2. append된(숫자가 거꾸로 바뀐) 빌더에 대해 parseInt(sb.toString())하여 int형으로 변환한다.
// 3. int형으로 변환된 숫자를 비교해 최대값을 출력한다.
