package co.micol.prj;

import co.micol.prj.member.Member;

public class MainApp {
	public static void main(String[] args) {
//		Carculator calculator = new Carculator();	//생성, Instance 만들자.
//		calculator.setFirstNum(200);	//setter를 통해 값을 전달한다.
//		calculator.setSecondNum(20);
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		Carculator carculator = new Carculator(20, 20);
//		int sum = carculator.sum();
//		int sub = carculator.sub();
//		
//		System.out.println("덧셈의 결과 " + sum);
//		System.out.println("뺄셈의 결과 " + sub);
//	}
	
//		MyCarculator myCarculator = new MyCarculator();{
//		myCarculator.sum(10, 10);
//		float f = myCarculator.sum(5.0f, 5);		//float 타입으로 리턴
//		System.out.println(f);
//		
//		int n = myCarculator.sum(5);
//		System.out.println(n);
//		}
//		
//		double d = myCarculator.sum(10.2, 10.2);
//			System.out.println(d);
//			
//		double d2 = myCarculator.sum(10.1, 100);
//		
//		CompareMax compareMax = new CompareMax(100, 50);
//		int max = compareMax.getMax();
//		System.out.println("두수중 큰값은: " + max);
//		
//		Carculator carculator = new Carculator();
//		carculator.setFirstNum(200);
//		carculator.setSecondNum(500);
//		System.out.println("전달된 두 수의 합 " + carculator.sum());
		
		Member member = new Member("hong", "1234", "홍길동", "대구광역시");
		member.run();
	}	
}
