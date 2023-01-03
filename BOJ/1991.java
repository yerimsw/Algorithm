import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr = new int[33][2];
    
    static void preOrder(int start, StringBuilder sb) {
        if(start == -1) return;
        sb.append((char)(start + 'A'));
        preOrder(arr[start][0], sb);
        preOrder(arr[start][1], sb);
    }

    static void inOrder(int start, StringBuilder sb) {
        if(start == -1) return;
        inOrder(arr[start][0], sb);
        sb.append((char)(start + 'A'));
        inOrder(arr[start][1], sb);
    }

    static void postOrder(int start, StringBuilder sb) {
        if(start == -1) return;
        postOrder(arr[start][0], sb);
        postOrder(arr[start][1], sb);
        sb.append((char)(start + 'A'));
    }
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int n = Integer.parseInt(br.readLine()); n-- > 0;) {
            st = new StringTokenizer(br.readLine());
            char c1 = st.nextToken().charAt(0);
            char c2 = st.nextToken().charAt(0);
            char c3 = st.nextToken().charAt(0);
            if(c2 == '.') arr[c1 - 'A'][0] = -1;
            else arr[c1 - 'A'][0] = c2 - 'A';
            if(c3 == '.') arr[c1 - 'A'][1] = -1;
            else arr[c1 - 'A'][1] = c3 - 'A';
        }
        StringBuilder sb = new StringBuilder();
        preOrder(0, sb);
        sb.append("\n");
        inOrder(0, sb);
        sb.append("\n");
        postOrder(0, sb);
        sb.append("\n");
        System.out.println(sb);
    }
}
