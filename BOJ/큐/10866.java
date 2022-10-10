import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();

        int N=Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            switch(st.nextToken()) {
                case "push_front" :
                    deque.addFirst(Integer.valueOf(st.nextToken()));
                    break;
                case "push_back" :
                    deque.addLast(Integer.valueOf(st.nextToken()));
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollFirst()+"\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollLast()+"\n");
                    break;
                case "size" :
                    bw.write(deque.size()+"\n");
                    break;
                case "empty" :
                    if(deque.size()==0) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front" :
                    if(!deque.isEmpty()) bw.write(deque.peekFirst()+"\n");
                    else bw.write("-1\n");
                    break;
                default:
                    if(!deque.isEmpty()) bw.write(deque.peekLast()+"\n");
                    else bw.write("-1\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
