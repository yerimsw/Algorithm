/** YerimSW 자연수 뒤집어 배열로 만들기.java
 *  문제: 자연수 n을 뒤집어 각 자리 숫자를 원소로 갖는 배열을 리턴한다.
 *  풀이: int형 n을 String 문자열로 변환해 끝 인덱스 부터 배열에 삽입한다.
 */

class Solution {
    public int[] solution(long n) {

        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        
        for(int i=num.length()-1, j =0 ; i>=0 ; i--, j++) {
            answer[j] = Character.getNumericValue(num.charAt(i));
        }
        
        return answer;
    }
}
