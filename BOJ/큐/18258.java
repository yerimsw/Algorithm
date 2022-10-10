import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int last=0;
        while(N-- > 0) {
            String str = br.readLine();
            switch (str) {
                case "pop" :
                    try {
                        bw.write(queue.remove() + "\n");
                    } catch(NoSuchElementException e) {
                        bw.write("-1\n");
                    }
                    break;
                case "size" :
                    bw.write(queue.size() + "\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front" :
                    try {
                        bw.write(queue.element() + "\n");
                    } catch(NoSuchElementException e) {
                        bw.write("-1\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(last+"\n");
                    break;
                default :
                    StringTokenizer st = new StringTokenizer(str);
                    st.nextToken();
                    last = Integer.parseInt(st.nextToken());
                    queue.add(last);
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
