package co.micol.prj;

public class MyCarculator { // Method Override
	public void sum(int n, int m) {
		System.out.println(n + m);
	}
	
	public float sum(float n , int m) {
		return n+m;
	}
	
	public float sum(float n, float m) {
		return n+m;
	}
	
	public double sum(double n, double m) {
		return n + m;
	}
	
	public int sum1(int n , int m, int l) {
		return n + m + 1;
	}
	
	public int sum(int n) {
		int factorial =1;
		for(int i=1; i<=n ; i++ ) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
