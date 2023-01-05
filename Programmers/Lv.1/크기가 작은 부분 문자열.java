class Solution {
    public int solution(String t, String p) {
        int answer = 0;
		long num1 = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-p.length(); i++) {
            long num2 = Long.parseLong(t.substring(i, i+p.length()));
            if(num1 >= num2) answer++;
        }
        
        return answer;
    }
}
