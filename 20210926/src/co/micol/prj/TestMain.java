package co.micol.prj;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		int n = scn.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int m = scn.nextInt();
		Test test = new Test(n, m);
		
		test.run();
	}
}
