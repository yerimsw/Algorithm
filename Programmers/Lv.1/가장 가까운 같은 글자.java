class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++) arr[i] = -1;
        
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int idx = c-'a';
            
            if(arr[idx]==-1) {
                answer[i]=-1;
                arr[idx]=0;
            }
            else {
                answer[i]=arr[idx];
                arr[idx]=0;
            }
            
            for(int j=0; j<26; j++) {
                if(arr[j]!=-1) arr[j]++;
            }
        }
        
        return answer;
    }
}

// 1. 26크기의 배열을 만들어 알파벳의 등장 여부, 횟수를 체킹한다.
// 2. 모든 알파벳에 대해 -1로 초기화 하여 등장하지 않음을 표기한다.
// 3. arr[idx]==-1 이라면 아직 등장하기 전, arr[idx]!=-1 이라면 등장 O
// 4. String s의 문자를 탐색할 때 마다 arr[idx]!=-1에 대해 횟수를 추가한다.
