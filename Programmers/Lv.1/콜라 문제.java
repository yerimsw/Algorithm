class Solution {
    public int solution(int a, int b, int n) {
        
    int answer = 0;
    
    while(n>=a) {
        int num = n/a;
        n -= (a*num) + num*b;
        answer += num*b;
    }
    
    return answer;
    }
}
