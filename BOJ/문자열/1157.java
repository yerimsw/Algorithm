import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        int max = 1;    // 최소 최댓값은 1이다.
        int maxCount = 0;

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >= 97) c-=32; // 대소문자 구분하지 않기 때문에 소문자를 대문자로 변경.
            if(!hashMap.containsKey(c)) hashMap.put(c,1); // 처음 세는 알파벳이면 카운트는 1이다.
            else {
                Integer integer = hashMap.get(c); // 알파벳에 대한 밸류 값을 얻는다.
                int cnt = integer; // auto-unboxing
                hashMap.put(c, ++cnt); // 원래의 값 +1을 넣는다.
                if (max <= cnt) max = cnt; // 방금 넣은 카운트 수가 max라면 갱신한다.
            }
        }

        char ans=' ';
        Iterator<Map.Entry<Character, Integer>> it = hashMap.entrySet().iterator(); // hashMap을 순회하는 iterator 생성.
        while(it.hasNext()) {
            Map.Entry<Character,Integer> entry = it.next();
            int num = entry.getValue(); // iterator가 가리키는 Entry객체의 Value 값
            if(num==max) {
                maxCount++; // 최대값이라면 maxCount를 1증가 (최대값의 개수를 확인하기 위함)
                ans = entry.getKey(); // 해당 알파벳을 저장
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(maxCount > 1) bw.write("?");
        else bw.write(ans);
        bw.flush();
        bw.close();
    }
}
// hashMap을 이용해보자
// 1. hashMap에 key(Alphabet), value(count)
// 2. String str 버퍼리더로 읽기
// 3. str for문으로 put(key, value) 하기 + max 갱신
// 4. values 컬렉션 만들어서 max값인 key를 max count 1이면 출력, 2이면 ?출력
