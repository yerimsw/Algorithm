class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int max = 0; // 최고 순위
        int min = 0; // 최저 순위
        
        for(int i=0; i<6; i++) {
            if(lottos[i] == 0) { // 0 이라면 최고 순위만 1++
                max++;
                continue;
            }
            for(int j=0; j<6; j++) { // 0이 아니라면 lottos 중 당첨 번호 있는지 확인
                if(lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                    break;
                }
            }
            
        }
        
        max = 7-max;
        min = 7-min;
        if(max >= 6) max=6; // 당첨 숫자가 0개일 경우 7순위 -> 6순위로 변경
        if(min >= 6) min=6;
        
        int[] answer = {max, min};
        return answer;
    }
}
