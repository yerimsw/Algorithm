import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
	public static int solution(String str) {
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(String s : arr)
			if(str.contains(s)) str = str.replaceAll(s, "*");
		return str.length();
	}
}
