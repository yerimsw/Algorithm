class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameChar = 0;
        int diffChar = 0;
        
        char firstChar = '0';
        boolean flag = true;
        
        for(int i=0; i<s.length(); i++) {
            if(flag) { // 기준문자 설정이 필요할 때
                firstChar = s.charAt(i);
                flag = false;
            }
            
            char curChar = s.charAt(i);
            
            if(firstChar == curChar) sameChar++;
            else diffChar++;
            
            if(sameChar == diffChar) { // 기준 문자 수 = 다른 문자 수일 때
                answer++;
                sameChar = 0;
                diffChar = 0;
                flag = true;
            }
        }
        
        if(sameChar != diffChar) answer++;
        return answer;
    }
}
