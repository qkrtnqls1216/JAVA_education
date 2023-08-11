package day6;

class Person{
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	public String getInfo() {
		return name;
	}
}

class Friend extends Person{
	String phoneNum;
	String email;
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() +"\t" +phoneNum +"\t" +email;
	}
}

public class FriendTest {

	public static void main(String[] args) {
		Friend friend1 = new Friend("사과","01012345678","123456@gmail.com");
		Friend friend2 = new Friend("딸기","01098745678","789484@gmail.com");
		Friend friend3 = new Friend("포도","01045685678","356946@gmail.com");
		Friend friend4 = new Friend("수박","01098655678","498566@gmail.com");
		Friend friend5 = new Friend("자두","01036475678","356987@gmail.com");
		System.out.println("이름\t"+"전화번호\t\t"+"메일주소\t");
		System.out.println("----------------------------------------");
		System.out.println(friend1.getInfo());
		System.out.println(friend2.getInfo());
		System.out.println(friend3.getInfo());
		System.out.println(friend4.getInfo());
		System.out.println(friend5.getInfo());
		
	}

}
