//����1
package chap3;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���:");
		String score = in.next();

		switch (score) {
		case "A":case "B":
			System.out.println("excellent");
			break;
		case "C":case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("bye");
			break;
		default:
			System.out.println("�߸� �� �Է��Դϴ�.");

		}

	}

}
