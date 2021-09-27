package co.micol.prj;

public class CompareMax { // 전달받은 두 수에 큰 값을 리턴하라.
	private int n;
	private int m;
	
	public CompareMax(int n, int m) {
		this.n = n;
		this.m = m;
			
	}
	
	public int getMax() {		//어떤값을 돌려주는 메소드를 만들때 getd을 쓴다.
		int max = 0;		// 두수가 같을때는 0을 리턴한다.
		
		if(n > m) {
			max = n;
		}else if(n < m) {
			max =m;
		}	
		return max;
	}
	
}
