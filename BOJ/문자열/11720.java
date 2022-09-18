import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 사용하지 않는 변수
        String str = br.readLine(); // 문자열 입력받기
        br.close();

        int sum=0;
        for(int i=0;i<str.length();i++){ // 문자열 숫자 값들 더하기
            sum += Character.getNumericValue(str.charAt(i));
        } // Character.getNumericValue : char 타입 문자의 값을 int형으로 얻는다.

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum)); // int형 sum값을 String형으로 변환한다.
        bw.flush();
        bw.close();
    }
}
