package co.micol.prj;

public class Test {
	private int n;
	private int m;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	private void getSum() {
		int sum = 0;
		for(int i =n; i <= m ; i++) {
			sum = sum + i;
		}
		System.out.println(n + "부터 " + m + "까지 의 합 = " + sum);
	}
	
	public void run() {
		getSum();
	}
	
	
}
