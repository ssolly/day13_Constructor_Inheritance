package day13_Constructor_Inheritance;

class AAA {
	public void aaa() {
		System.out.println("test");
	}
}

class Calc06 extends AAA {
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private string 변수";
	protected String ssss = "protected string 변수";
	// protected : 상속 받은 자식 클래스에는 허용하는 변수, 그러나 외부에선 접근 불가능
	public Calc06(String s) {
		System.out.println(s + " 부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}

class Computer06 extends Calc06 {
	public int n = 7777;
	public Computer06(String sss) {
		super(sss);
		System.out.println(sss + " : 자식 생성자");
		test(); //자식 클래스에 test가 없다면 부모 클래스 test() 실행
		super.test(); //부모의 test
		System.out.println("n(this) : " + n); 			//자식클래스
		System.out.println("n(super) : " + super.n);	//부모클래스
		System.out.println("s : " + s);					//자식클래스에 없는 변수 = 부모에서 가져옴
		//System.out.println("super.ss(private) : " + super.ss ); private은 불가능
		System.out.println("ssss : " + ssss);			//protected는 사용 가능
		
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
}

public class Ex06_Inheritance {

	public static void main(String[] args) {
		
		Computer06 com = new Computer06("전달");
		com.aaa();
	}
}