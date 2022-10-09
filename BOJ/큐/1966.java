import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        Queue<Integer> queue = new LinkedList<>();

        while (T-- > 0) {
            String str = br.readLine();
            StringTokenizer st1 = new StringTokenizer(str);

            int N = Integer.parseInt(st1.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st1.nextToken()); // 중요 문서의 인덱스

            int last = N-1;
            int max = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            String documents = br.readLine();
            StringTokenizer st2 = new StringTokenizer(documents);
            while (st2.hasMoreTokens()) {
                int num = Integer.parseInt(st2.nextToken());
                queue.add(num);
                arr.add(num);
            }

            Collections.sort(arr); // 오름차순 정렬렬
            max = arr.get(arr.size()-1); // 중요도 max 값은 arr의 마지막 인덱스

            int cnt=1; // 몇번째로 인쇄되는지 카운팅하는 변수
            while(!queue.isEmpty()) {
                if(queue.peek() == max){ // 가장 중요도가 큰 문서가 queue의 peek이라면
                    if(M==0) break; // 동시에 추적 문서가 peek이라면 break;
                    queue.poll();
                    cnt++;
                    M--;
                    max=arr.get(--last);
                }
                else { // 중요도가 큰 문서가 queue의 peek이 아닌데
                    if(M==0) M=last; // 추적 문서가 0번째이면 다시 마지막으로 옮김.
                    else M--;
                    queue.add(queue.poll());
                }
            }
            System.out.println(cnt);
            queue.clear();
        }
    }
}

// 1. 중요도 배열을 만들어서 정렬하기. 마지막 인덱스에 최댓값이 오고, 큐에서 문서가 빠질 때 마다 last(마지막인덱스)-- 하기.
// 2.1 큐의 peek이 max보다 작으면 poll & add, M(추적하는 문서의 큐 상에서 인덱스)--;
// 2.2 큐의 peek이 max라면 poll, cnt++, last(큐에 남아있는 문서 개수 & 최대 중요도 문서의 인덱스)--, M(추적하는 문서의 큐 상에서 인덱스)--, max값 갱신;

// int / cnt / 추적하는 문서가 몇번째로 출력 되는지 카운트하는 변수
// int / M / 추적하는 문서의 큐 상에서의 인덱스를 나타내는 변수
// int / last / 현재 큐에 남아있는 문서 개수 & 최대 중요도를 가리키는 arr 인덱스 변수
// ArrayList<Integer> / arr / 문서들의 중요도를 오름차순으로 정렬한 리스트
