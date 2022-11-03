import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sec = 0;
        String dial = br.readLine();
        br.close();
        
        for(int i=0; i<dial.length(); i++) {
            char c = dial.charAt(i);
            if(c < 68) sec += 3;
            else if(c < 71) sec += 4;
            else if(c < 74) sec += 5;
            else if(c < 77) sec += 6;
            else if(c < 80) sec += 7;
            else if(c < 84) sec += 8;
            else if(c < 87) sec += 9;
            else if(c < 91) sec += 10;
        }
        
        System.out.println(sec);
    }
}

// 1. 문자열을 받고 charAt() 메서드로 각 문자에 접근하여 아스키 코드 값을 도출한다.
// 2. 알파벳 아스키 코드 값에 따라 지정된 숫자를 결과에 더해준다.
