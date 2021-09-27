package co.micol.prj.member;

public class Member {		//정보은폐
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
		System.out.print("아이디: " + Id + " ");
		System.out.print("패스워드: " + Pw + " ");
		System.out.print("이름: " + Name + " ");
		System.out.print("주소: " + Address);
	}
	
	public void run() {
		memberPrint();
	}
}
