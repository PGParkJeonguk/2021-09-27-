package co.micol.prj.member;

public class Member {		//��������
	private String Id;
	private String Pw;
	private String Name;
	private String Address;
	
	public Member(String id, String pw, String name, String address) {
		this.Id = id;
		this.Pw = pw;
		this.Name = name;
		this.Address = address;
	}
	
	private void memberPrint() {
		System.out.print("���̵�: " + Id + " ");
		System.out.print("�н�����: " + Pw + " ");
		System.out.print("�̸�: " + Name + " ");
		System.out.print("�ּ�: " + Address);
	}
	
	public void run() {
		memberPrint();
	}
}
