package co.micol.prj;

public class Carculator {	//Class ����, ������.
	private int firstNum;
	private int secondNum;
	
	public Carculator() {	//�⺻������
		
	}
	
	public Carculator(int n, int m) {		//�����ڸ� �������̵�, �����ڸ� ���� �� ���޹��
		this.firstNum = n;
		this.secondNum = m;
	}
	
	public Carculator(int n) {
		this.firstNum =n;
	}
	
	public void setFirstNum(int n) {		//���� ������� ���� = setter
		this.firstNum = n;
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
