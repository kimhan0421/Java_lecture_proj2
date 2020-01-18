//문제3
package chap3;

import java.util.Scanner;

public class FactorialTest02 {

	public static void main(String[] args) {

		int result;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		result = factorial(n);
		System.out.println(result);
	}

	static int factorial(int n) {
		int result = 1;
		while (n >= 1)
			result *= n--;
		return result;

	}
}
