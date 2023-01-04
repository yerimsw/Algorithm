class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i=0; i<=t.length()-p.length(); i++) {
            boolean flag = true;

            for(int j=0; j<p.length(); j++) {
                int numT = Character.getNumericValue(t.charAt(i+j));
                int numP = Character.getNumericValue(p.charAt(j));
                if(numT > numP) {
                    flag = false;
                    break;
                }
            }

            if(flag) answer++;
        }
        
        return answer;
    }
}
