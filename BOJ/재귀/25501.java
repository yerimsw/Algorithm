import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(--T >= 0){
            String str = br.readLine();
            System.out.println(isPalindrome(str)+" " +cnt);
            cnt = 0;
        }
        br.close();
    }

    static int cnt=0; // recursion 함수 호출 횟수

    static int recursion(String str, int lft, int rgt){
        cnt++;
        if(lft >= rgt) return 1; // true
        else if(str.charAt(lft) != str.charAt(rgt)) return 0; // false
        else return recursion(str,++lft,--rgt);
    } // 양 끝의 문자를 비교하는 메서드

    static int isPalindrome(String str){
        return recursion(str,0,str.length()-1);
    }
}

// 1. 양 끝에서부터 왼쪽+1, 오른쪽-1 하며 문자를 비교한다.
// 2. 왼쪽과 오른쪽이 같거나(홀수), 왼쪽이 오른쪽을 초과했을 때(짝수), true.
// 3. 왼쪽과 오른쪽이 다르면 false
// 4. 둘다 아니면 다시 호출
