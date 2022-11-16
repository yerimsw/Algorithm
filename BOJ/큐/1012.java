import java.util.*;
import java.io.*;

public class Main {
    static Queue<Node> queue = new LinkedList<>();
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int map[][];
    static boolean visit[][];

    static int curX, curY;
    static int N,M,K;
    static int count;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visit = new boolean[N][M];

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            count = 0;
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {

                    if(visit[j][k] == false && map[j][k] == 1) {
                        count++;
                        BFS(k, j);
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    static void BFS(int x, int y) {
        queue.offer(new Node(x, y));
        visit[y][x] = true;

        while( !queue.isEmpty() ) {
            Node node = queue.poll();

            for(int i=0; i<4; i++) {
                curX = node.x + dirX[i];
                curY = node.y + dirY[i];

                if(Range_check() && visit[curY][curX] == false && map[curY][curX] == 1) {
                    queue.offer(new Node(curX, curY));
                    visit[curY][curX] = true;
                }

            }
        }
    }

    public static boolean Range_check() {
        return (curX >= 0 && curX < M && curY >= 0 && curY < N);
    }
}
