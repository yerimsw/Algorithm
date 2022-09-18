import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 입력받기
        br.close();

        byte[] chk = new byte[26]; // 알파벳 첫 등장 위치 저장배열
        for(byte i=0; i<chk.length; i++) chk[i]=-1; // 배열 -1로 초기화

        for(byte i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(chk[c-97] == -1) { // 이전에 등장한 적이 없다면
                chk[c-97] = i; // 해당 위치를 배열에 저장하고, i는 다음 위치를 가리킨다.
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(byte b:chk){
            bw.write(String.valueOf(b)+" "); // byte형을 String형으로 변환한다.
        }
        bw.flush();
        bw.close();
    }
}

// 0. String charAt으로 돌면서
// 1. chk배열(byte)이 -1이라면(등장한 적 없다면),
// 2. chk배열(byte)에 i를 저장
// 3. chk배열 돌면서(for each) -1 or 해당 값 출력
