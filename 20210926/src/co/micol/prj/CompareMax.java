package co.micol.prj;

public class CompareMax { // ���޹��� �� ���� ū ���� �����϶�.
	private int n;
	private int m;
	
	public CompareMax(int n, int m) {
		this.n = n;
		this.m = m;
			
	}
	
	public int getMax() {		//����� �����ִ� �޼ҵ带 ���鶧 getd�� ����.
		int max = 0;		// �μ��� �������� 0�� �����Ѵ�.
		
		if(n > m) {
			max = n;
		}else if(n < m) {
			max =m;
		}	
		return max;
	}
	
}
