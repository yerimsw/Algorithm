class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10]; // 인덱스 0~9 까지 0으로 초기화 된다.
        
        for(int num : numbers) arr[num] = 1;
        for(int i=0; i<10; i++) {
            if(arr[i]==0) answer += i;
        }
        return answer;
    }
}
// 1. 숫자 배열을 생성한다. (인덱스가 값)
// 2. 나온 숫자는 arr[num] = 1; 해준다.
// 3. for문으로 0인 num을 더한다.
