class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if(isArith(common)) { // 등차수열인 경우
            int r = common[1] - common[0];
            answer = common[0] + (common.length * r);
        }
        else { // 등비수열인 경우
            int r = common[1] / common[0];
            answer = common[common.length-1] * r;
        }
        return answer;
    }
    
    public boolean isArith(int[] common) {
        int num1 = common[0] - common[1];
        int num2 = common[1] - common[2];
        return num1 == num2 ? true:false;
    }
}
