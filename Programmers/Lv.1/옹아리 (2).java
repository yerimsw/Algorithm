class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
            if(str.contains("ayaaya")||str.contains("mama")||str.contains("woowoo")||str.contains("yeye")) continue;
            str = str.replace("aya"," ");
            str = str.replace("ye"," ");
            str = str.replace("woo"," ");
            str = str.replace("ma"," ");
            str = str.replace(" ","");
        
            if(str.length()==0) answer++;
        }
        return answer;
    }
}
