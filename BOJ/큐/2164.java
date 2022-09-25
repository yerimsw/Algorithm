import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int method(int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1; i<=n; i++) queue.add(i);

        while(!queue.isEmpty()) {
            queue.poll();
            queue.add(queue.poll());
            if(queue.size()==1) break;
        }

        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1) System.out.println(1);
        else System.out.println(method(n));
    }
}
