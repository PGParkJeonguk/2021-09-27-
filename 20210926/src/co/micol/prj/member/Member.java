package co.micol.prj.member;

public class Member {		//��������
	private String Id;
	private String Pw;
	private String name;
	private String address;
	
	public Member(String id, String pw, String name, String address) {
		this.Id = id;
		this.Pw = pw;
		this.name = name;
		this.address = address;
	}
	
	private void memberPrint() {		// ��������
		System.out.print("���̵�: " + Id + " ");
		System.out.print("�н�����: " + Pw + " ");
		System.out.print("�̸�: " + name + " ");
		System.out.print("�ּ�: " + address);
	}
	
	public void run() {
		memberPrint();
	}
}
