import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for(int i=1; i<=n; i++) deque.addLast(i); // 1~N 숫자 삽입

        int cnt2 = 0; // 2번 연산
        int cnt3 = 0; // 3번 연산

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();
        while(st2.hasMoreTokens()) {

            int i = Integer.parseInt(st2.nextToken()); // 제거할 숫자
            Iterator iterator = deque.iterator();
            int idx = 1;
            while(iterator.hasNext()){ // 제거할 숫자의 인덱스를 알아낸다.
                if((int)iterator.next() == i) break;
                idx++;
            }

            int size = deque.size();
            if(idx > size/2+1) {
                int cnt = (size-idx+1);
                cnt3 += cnt; // 인덱스가 사이즈/2 보다 크면 3번 연산
                for(int j=0; j<cnt; j++){
                    deque.addFirst(deque.pollLast());
                }
            }
            else {
                int cnt = (idx-1); // 사이즈/2 보다 작거나 같으면 2번 연산
                cnt2 += cnt;
                for(int j=0; j<cnt; j++) {
                    deque.addLast(deque.pollFirst());
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt2+cnt3);
    }
}
