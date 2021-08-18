package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01 {
	public int num;
}

public class Ex03_Singleton {

	public static void main(String[] args) {
		
		// singleton : 하나의 공간을 공유해서 같이 쓰겠다
		// 싱글톤 대표 예시 : 캘린더 (new Calendar(); 라고 사용 X)
		Calendar cal = Calendar.getInstance();
				
		Singleton01 si = new Singleton01();
		//Singleton01 si02 = new Singleton01();
		Singleton01 si02 = si;
		
		si.num=12345;
		si02.num=2222;
		
		System.out.println("si.num : " + si.num);
		System.out.println("si02.num : " + si02.num);
		
		System.out.println("si : " + si);
		System.out.println("si02 : "+ si02);
	}
}
