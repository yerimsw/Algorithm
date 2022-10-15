/* YerimSW 정수 내림차순으로 배치하기.java
 * 문제: 주어진 정수의 각 자리수를 내림차순으로 정렬하는 문제.
 * 풀이1: 주어진 정수를 String으로 전환하고, 각 숫자를 0~9의 배열에 카운팅, 9부터 0 순으로 횟수를 출력한다.
 * 풀이2: 주어진 정수를 10 나머지 연산을 하여 각 숫자를 0~9의 배열에 카운팅, 9부터 0 순으로 횟수를 출력한다.
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

class Solution {
    public long solution(long n) {
        long answer = 0L;
        int[] chk = new int[10];
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            chk[(int)(n%10)]++; // n이 21,4748,3647을 초과할 경우 오버플로우될 수 있음, 인덱스는 int 타입이므로 (n%10)을 int로 형변환 한다.
            n/=10;
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
