package day13_Constructor_Inheritance;

class Calc01 {								//부모 클래스
	public void display() {
		System.out.println("계산기 생성");
	}
}

class Computer01 extends Calc01 {			//자식 클래스
	public void print() {
		System.out.println("컴퓨터 생성");
	}
	/*public void display() {			
		System.out.println("자식 클래스 계산기 생성");
	}
	만약 부모 클래스와 동일한 이름의 메소드가 있다면 본인 클래스를 실행한다. 없으면 부모 클래스 확인 후 실행
	*/
}

public class Ex05_Inheritance {
	
	/*
	 # 상속
	  - extends를 통해 만든다
	  - 새로운 기능을 추가한다
	 */

	public static void main(String[] args) {
		
		Computer01 com = new Computer01();
		com.print();
		com.display();
		
		Calc01 ca = new Calc01();
		ca.display();
		
	}
}
