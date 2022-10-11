import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int pSize = str2.length();
        StringBuilder arr = new StringBuilder("");

        for(int i=0; i<str1.length(); i++) {
            arr.append(str1.charAt(i));
            if(pSize <= arr.length()) { // 배열 사이즈가 폭발 문자열보다 클 때
                StringBuilder sb = new StringBuilder();
                int end = arr.length();
                for (int j = end - pSize; j < end; j++) { // 마지막 애들 폭발 문자열 만큼 비교해서 같으면 remove
                    sb.append(arr.charAt(j));
                }
                if(str2.equals(sb.toString())) { // 폭발문자열과 일치할 때
                    for(int j=0; j<str2.length();j++) arr.deleteCharAt(arr.length()-1);
                    // end - 1을 하면 안되는 이유 : end는 for문에 따라 함께 -- 되지 않기 때문에, 계속 동일한 인덱스를 지우게 된다.
                }
            }
        }
        br.close();

        if(arr.length()==0) System.out.println("FRULA");
        else System.out.print(arr.toString());
    }
}

// 1. StringBuilder에 한 캐릭터 씩 append 한다.
// 2. StringBuilder의 길이가 폭발문자열보다 길다면, 가장 마지막의 폭발문자열 길이만큼의 문자열과 동일한지 확인한다.
// 3. 폭발문자열과 일치하면 삭제하고, 아니라면 다음 캐릭터로 넘어간다.
