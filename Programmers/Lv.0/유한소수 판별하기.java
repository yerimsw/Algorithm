class Solution {
    public int solution(int a, int b) {
        // 1. 기약분수 분모 구하기
        int fraction = b / gcd(a,b);
        
        // 2. 분모의 소인수가 2 or 5 뿐이면 유한소수
        while(fraction!=1) {
            if(fraction%2 == 0) fraction/=2;
            else if(fraction%5 == 0) fraction/=5;
            else break; // 2와 5가 아닌 다른 약수가 존재할 때
        }
        
        if(fraction==1) return 1;
        else return 2;
    }
    
    // 최대 공약수를 구하는 메서드
    public int gcd(int a, int b) {
        if(b==0) return a;
        else return gcd(b, a % b);
    }
}
