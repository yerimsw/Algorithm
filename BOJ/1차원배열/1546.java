import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // String -> int
        // Character 를 제외한 모든 wrapper 클래스는 parseXXX() 메서드를 가지며, String을 XXX 원시타입으로 전환한다.

        double max = 0;
        double[] grades = new double[N]; // 점수들을 저장할 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            grades[i] = Double.parseDouble(st.nextToken());
            if (grades[i] >= max) max = grades[i]; // 최대값 갱신
        }
        br.close();
        // readLine() 메서드는 리턴값이 String 타입으로 고정이기 때문에 다른 타입의 데이터를 입력받길 원할 경우 추가적인 형변환이 필요.
        // readLine() 메서드는 반드시 예외처리 필요하다.

        double sum = 0;
        for (double grade : grades) {
            sum += (grade / max) * 100;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum / (double) N));
        bw.flush();
        bw.close();
        // write()메서드로 버퍼에 값을 저장하고, flush()로 출력한다
    }
}

// 1. N을 입력받고 점수를 저장할 double 배열을 선언한다.
// 2. double 배열에 점수를 저장하면서 최대값을 찾는다.
// 3. double 배열에 저장된 점수들을 grade/max*100 하고 평균을 구한다.
