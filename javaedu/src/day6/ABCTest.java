package day6;

class A{
	A(){
		System.out.println("A 클래스 객체 생성");
	}
}
class B extends A{
	B(){
		System.out.println("B 클래스 객체 생성");
	}
}

class C extends B{
	C(){
		System.out.println("C 클래스 객체 생성");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		new C();
	}
}
