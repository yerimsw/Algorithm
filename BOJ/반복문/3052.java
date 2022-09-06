import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] chk = new boolean[42];
        Arrays.fill(chk,false); // chk배열을 false로 초기화

        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            int num = sc.nextInt();
            if(chk[num%42]) continue; // 이미 num%42가 나온적 있다면 컨티뉴
            else {
                chk[num%42]=true;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
// 1. 나머지는 0~41까지 총 42개
// 2. 42개 공간을 갖는 배열을 생성하여 chk할 것.
// 2-1. bool chk[42]={false,};
// 2-2. if(chk[num]) continue;
//		else chk[num]=true; cnt++;
