package co.micol.prj.member;

public class Member {		//정보은폐
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
	
	private void memberPrint() {		// 정보은폐
		System.out.print("아이디: " + Id + " ");
		System.out.print("패스워드: " + Pw + " ");
		System.out.print("이름: " + name + " ");
		System.out.print("주소: " + address);
	}
	
	public void run() {
		memberPrint();
	}
}
