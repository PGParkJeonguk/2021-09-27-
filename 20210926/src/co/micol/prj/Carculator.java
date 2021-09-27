package co.micol.prj;

public class Carculator {	//Class 정의, 만들자.
	private int firstNum;
	private int secondNum;
	
	public Carculator() { // 기본생성자
		
	}
	
	public Carculator(int n , int m){		//생성자 오버라이딩, 생성자를 통한 값 전달 방법 =>다형성.
		this.firstNum = n;
		this.secondNum = m;
		
	}
	
	public Carculator(int n) {
		this.firstNum = n;
	}
	
	public void setFirstNum(int n) {		//값을 집어넣는 변수	setter
		this.firstNum = n;
	}
	

	public int getFirstNum() {			//값을 가져오는 변수	getter
		return firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public int getSecondNum() {
		return secondNum;
	}
	
	public int sum() {
		return firstNum + secondNum;
	}
	
	public int sub() {
		return firstNum - secondNum;
	}
	
	
	
}
