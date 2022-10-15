/* YerimSW 하샤드 수.java
 * 문제: 각 자리수 합이 주어진 수로 나눠질 수 있으면 true, 아니면 false를 리턴한다.
 * 풀이: 나머지 연산으로 각 자리의 수를 더한 뒤, 주어진 수에서 나눈다.
 */

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x; // 주어진 수
        int sum = 0; // 각 자리수의 합
        
        while(x>0) {
            sum += (x % 10);
            x /= 10;
        }
        
        if(n % sum != 0) answer = false;
        return answer;
    }
}
