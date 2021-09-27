package co.micol.prj;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Test test = new Test();
		System.out.println("첫번째 값을 입력하세요.");
		test.setN(scn.nextInt());
		System.out.println("두번째 값을 입력하세요.");
		test.setM(scn.nextInt());
		
		test.run();
	}
}
