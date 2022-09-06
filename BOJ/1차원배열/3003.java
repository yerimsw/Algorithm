import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,8};

        Scanner scanner = new Scanner(System.in);
        for(int i : arr){
            int num = scanner.nextInt();
            System.out.print((i-num)+" ");
        }
    }
}
// 1. 기준이 되는 개수 배열을 생성
// 2. for each문 배열을 돌며 입력값과 비교하여 출력
