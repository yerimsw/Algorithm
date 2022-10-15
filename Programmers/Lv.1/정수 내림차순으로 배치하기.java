/* YerimSW 정수 내림차순으로 배치하기.java
 * 문제: 주어진 정수의 각 자리수를 내림차순으로 정렬하는 문제.
 * 풀이: 주어진 정수를 String으로 전환하고, 각 숫자를 0~9의 배열에 카운팅, 9부터 0 순으로 횟수를 출력한다.
 */

class Solution {
    public long solution(long n) {
        long answer = 0L;
        int[] chk = new int[10];
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++) {
            chk[Character.getNumericValue(str.charAt(i))]++;
        }
        
        for(int i=9; i>=0; i--) {
            for(int j=0; j<chk[i]; j++) {
                sb.append(i);
            }
        }
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}
