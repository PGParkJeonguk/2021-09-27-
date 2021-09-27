package co.micol.prj;

public class Test {
	private int n;
	private int m;
	
	public Test(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	private void getSum() {
		int sum = 0;
		for(int i = n; i<=m; i++) {
			sum = sum + i;
		}
		System.out.println(n + "에서 " + m + "까지의 더한값 = " + sum );
	}
	
	public void run() {
		getSum();
	}
	
}
