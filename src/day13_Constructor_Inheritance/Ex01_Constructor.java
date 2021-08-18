package day13_Constructor_Inheritance;

class Constructor01 {
	
	Constructor01() {
		System.out.println("생성자 실행");
		//따로 생성하지 않아도 자바에서 자동적으로 생성 후 삭제시켜준다
		//띠로 생성했을 시 default 생성자는 생성되지 않는다
	}
	
	/*
	 Constructor01(String s) {
	 	System.out.println(s+"생성자 실행");
	 }
	 */
	
	public void test(String s) {
		System.out.println(s +  " : test 실행");
	}
	
	public void test() {
		System.out.println("기본 테스트");
	}
}

public class Ex01_Constructor {
	
	/*
	 # Constructor(생성자)
	  - 보통 초기화를 하고자 할 떄 사용한다
	  - 클래스 이용과 동일하게 만든다
	  - 반환 타입은 없어야 한다
	  - 객체가 생성 될 때 자동으로 호출된다
	 # 생성자 만드는 방법
	  - 클래스 이용과 동일하게 만든다
	  - 반환 타입은 없어야 한다
	 */
	
	public static void main(String[] args) {
		
		Constructor01 con = new Constructor01();
		//Constructor01 com = new Constructor01("생성자");
		con.test();
		con.test("테스트");
		
	}
	
}
