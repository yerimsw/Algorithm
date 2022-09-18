import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Test Case

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(--T >= 0) {
            String str = br.readLine();
            if(T==0) br.close(); // TestCase 개수 만큼 읽었으면 스트림 종료
            StringTokenizer st = new StringTokenizer(str); // 반복횟수 cnt와 문자열을 자르기 위함.

            byte cnt = (byte) Byte.parseByte(st.nextToken()); // String을 byte로 형변환
            char[] arr = st.nextToken().toCharArray(); // 테스트 케이스 문자열 -> char 배열

            StringBuilder sb = new StringBuilder(); // 반복횟수 만큼 변환된 문자열
            for(char c : arr) for(byte j=0; j<cnt; j++) sb.append(c); // 지정 횟수만큼 저장
            bw.write(sb+"\n");
            bw.flush();
        }
        bw.close();
    }
}

// 1. TestCase T에 받아 while문으로 반복
// 2. 각 테케 별 StringTokenizer로 cnt(반복횟수)와 문자열을 분리
// 3. 문자열은 String.toCharArray() 메서드로 char 배열로 변환
// 4. for each문으로 배열의 각 character을 cnt 만큼 반복하여 StringBuilder에 append & 출력
