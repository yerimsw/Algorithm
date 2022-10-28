public class Main {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in); 

    String a = sc.next();
    String b = input();
 
    int maxlength = max(strA.length(), strB.length()); 
    int[] arrA = new int[maxlength + 1];
    int[] arrB = new int[maxlength + 1];

    for(int i=a.length()-1, int idx=0; i>=0; i--, idx++) {
      arrA[idx] = a.charAt(i)-'0';
    }
    for(int i=b.length()-1, int idx=0; i>=0; i--, idx++) {
      arrB[idx] = b.charAt(i)-'0';
    }
 
  
    for(int i = 0; i < maxlength; i++) {
	    int value = arrA[i] + arrB[i];
	    arrA[i] = value % 10;	
      arrA[i + 1] = arrA[i + 1] + (value / 10);
    }
 
    if(arrA[maxlength] != 0) {
    	print(arrA[maxlength]);
    }
    for(int i = maxlength - 1; i >= 0; i--) {
    	print(arrA[i]);
    }
  }
}

/*
BigInteger A = new BigInteger(input());
BigInteger B = new BigInteger(input());
A = A.add(B);
print(A.toString());
*/
