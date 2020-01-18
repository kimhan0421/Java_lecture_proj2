//¹®Á¦4
package chap3;

public class FactorialTest03 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int n1) {
		int result = 1;
		while (n1 >= 1)
			result *= n1--;
		return result;

	}

	public static int factorial(int n1, int n2) {
		int result = 1;
		while (n2 >= n1)
			result *= n2--;
		return result;

	}

}
