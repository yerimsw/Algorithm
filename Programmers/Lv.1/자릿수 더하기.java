/** YerimSW 자릿수 더하기.java
 *  문제: 자연수 n의 각 자리수의 합을 반환한다.
 *  풀이법: 숫자를 문자열로 전환해 합을 구한다.
 */
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = String.valueOf(n);
        for(int i=0; i<num.length(); i++) {
            answer += (num.charAt(i)-'0');
        }

        return answer;
    }
}
