/* YerimSW 문자열 내 p와 y의 개수.java
 * 문제: 주어진 문자열 s 내의 p와 y의 개수가 동일하면 true, 아니면 false를 반환한다.
 * 풀이: 문자열을 순회하며 p,P 의 개수와 y,Y 의 개수를 비교한다.
 */
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount=0;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='p'||c=='P') pCount++;
            else if(c=='y'||c=='Y') yCount++;
        }
        
        if(pCount != yCount) answer = false;
        return answer;
    }
}
