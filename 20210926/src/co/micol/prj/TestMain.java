package co.micol.prj;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요.");
		int n = scn.nextInt();
		System.out.println("두번째 값을 입력하세요.");
		int m = scn.nextInt();
		Test test = new Test(n, m);
		
		test.run();
	}
}
