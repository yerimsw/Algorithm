import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m<45) {
            m = (60+m)-45;
            if(h==0) h=23;
            else h--;
        }
        else m = m-45;

        System.out.println(h+" "+m);
    }
}
/*
 * 1. 45분 보다 작을 때
 * 2. 0시라면 23시 60+m-45분
 * 3. 아니라면 h-1시 m분
 */
