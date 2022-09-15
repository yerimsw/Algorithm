public class Main {
    public static void main(String[] args) throws Exception {
        boolean[] chk = new boolean[10001]; // 셀프넘버 여부 체크 배열
        for(int i=1; i<=10000; i++){
            if(!chk[i]) System.out.println(i); // 셀프넘버라면 출력하기
            int num = i; // i로 만들 다음 숫자 num
            int j = i;  // 각 자리수를 더할 숫자 j
            while(j>0){
                num += (j%10);
                j/=10;
            }
            if(num>10000) continue; // num이 10000을 넘어가면 chk 안하고 넘어가도 됨
            chk[num] = true;
        }
    }
}
// 1부터 10000까지 각 자리 수를 더한 숫자를 제외하고 출력한다.
// chk[i]가 true라면 셀프넘버가 아니다.
// chk[i]가 false라면 셀프넘버다. 출력한다.
// 주의! 각 자리 수를 더한 숫자가 10000을 넘어가면 continue 한다.
