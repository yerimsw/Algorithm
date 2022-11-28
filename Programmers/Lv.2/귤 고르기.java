import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 1. 귤 종류 수를 구하기
        int max = 0;
        for(int i:tangerine) {
            if(max<i) max=i;
        }

        // 2. 종류 별 개수를 구하기
        Integer[] arr = new Integer[max];
        for(int i=0; i<arr.length; i++) {
            arr[i] = 0;
        }

        for(int i:tangerine) {
            arr[i-1]++;
        }

        // 3. 귤 k개를 고를 때, 최소 종류 개수를 구하기
        Arrays.sort(arr, Collections.reverseOrder());
        int idx = 0;

        while(k>0) {
            k -= arr[idx];
            idx++;
        }
        
        return idx;
    }
}
