package co.micol.prj;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Test test = new Test();
		System.out.println("ù��° ���� �Է��ϼ���.");
		test.setN(scn.nextInt());
		System.out.println("�ι�° ���� �Է��ϼ���.");
		test.setM(scn.nextInt());
		
		test.run();
	}
}
