/** YerimSW 약수의 합.java
 *  문제: 주어진 숫자 n의 약수들을 더해 반환하는 문제.
 *  풀이법: 1부터 n까지의 숫자로 나머지 연산을 해 0인 수를 더한다.
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0) answer+=i;
        }
        
        return answer;
    }
}
