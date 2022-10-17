import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N+1];
        Queue<Integer> queue = new LinkedList<>();

        int[][] arr = new int[N+1][N+1];
        while(M-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        br.close();

        queue.add(R); // 시작점
        visited[R] = true;
        int[] arr2 = new int[N+1];
        arr2[R] = 1;
        int cnt=1;

        while(!queue.isEmpty()) {
            int fromNode = queue.poll();
            for(int toNode=0; toNode<N; toNode++){
                if(arr[fromNode][toNode] == 1) {
                    if (visited[toNode]) continue;
                    else {
                        visited[toNode] = true;
                        queue.add(toNode);
                        arr2[toNode] = ++cnt;
                    }
                }
            }
        }
        for(int i=1; i<=N; i++) {
            System.out.println(arr2[i]);
        }
    }
}
