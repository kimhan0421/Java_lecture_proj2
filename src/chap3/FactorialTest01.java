//문제2
package chap3;

import java.util.Scanner;

public class FactorialTest01 {

	public static void main(String[] args) {
	      int result = 1;
	      int n;
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("팩토리얼 값을 구할 정수: ");
	      n = in.nextInt();
	      
	      while(n>1) {
	         result *= n--;
	         
	      }
	      System.out.print(result);
	      in.close();   
	      }

}
