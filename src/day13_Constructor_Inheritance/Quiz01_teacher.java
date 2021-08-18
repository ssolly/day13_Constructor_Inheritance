//package day13_Constructor_Inheritance;
//
//import java.util.*;
//import java.text.*;
//
//class Win7Quiz{
//	
//	private String[] name;
//	private String[] info;
//	
//	public Win7Quiz(String c,String m, String cPath,String mPath){
//		name = new String[2];
//		name[0]=c;name[1]=m;
//		info = new String[2];
//		info[0]=cPath;info[1]=mPath;
//	}
//	
//	public void function(String funcName){
//		String[] name = getName();
//		String[] info = getInfo();
//		HashMap map = new HashMap();
//		for(int i=0;i<name.length;i++){	map.put(name[i], info[i]); }
//		if(map.containsKey(funcName)){
//			System.out.println(map.get(funcName)+"사용 합니다");
//		}else{System.out.println("없는 기능 입니다");}
//	}
//	
//	public void funcPrint(){
//		System.out.print("[사용가능] : ");
//		String[] name = getName();
//		for(int i=0;i<name.length;i++){
//			System.out.print(name[i]+"  ");
//		}
//		System.out.println();
//	}
//	
//	public String[] getName() {	
//		return name;	}
//	public String[] getInfo() {	
//		return info;	}
//	
//	public void display(){
//		Scanner input = new Scanner(System.in);
//		System.out.println("===== 환 영 합 니 다 =====");
//		int sel=0;
//		String funcName=null;
//		while(true){
//			System.out.println("1.기 능");
//			System.out.println("2.off");
//			System.out.print("입력 >>>> ");
//			sel = input.nextInt();
//			switch(sel){
//				case 1:
//					funcPrint();
//					System.out.print("사용할 기능 입력 : ");
//					funcName=input.next();
//					function(funcName);break;
//				case 2:return;
//			}
//		}
//	}
//}
//
//class Login extends Win7Quiz{
//	
//    private String userId=null,userPw=null;
//    
//    public Login(String c,String m,String cPath,String mPath){
//    	super(c,m,cPath,mPath);
//    }
//    
//    public int compare(String id,String pw){
//        if(getUserId() != null  && getUserPw() != null) {
//            if(getUserId().equals(id) && getUserPw().equals(pw)) {
//            	return 0;
//            } else {
//            	return 1;
//            }
//        }
//        return 1;
//    }
//    
//    public void saveId_Pw(String id,String pw){ 
//    	setUserId(id); setUserPw(pw); }
//    
//    public boolean out(){	
//    	return false;	
//    }
//    
//	public String getUserId() {	
//		return userId;	
//	}
//	
//	public void setUserId(String id) {	
//		this.userId = id;	
//	}
//	
//	public String getUserPw() {	
//		return userPw;	
//	}
//	
//	public void setUserPw(String pw) {	
//		this.userPw = pw; 
//	}
//}
//
//public class Quiz01_teacher {
//	public static void main(String[] args){
//		
//		Scanner input = new Scanner(System.in);
//		
//		int num=0,result=0; String inputId=null,inputPw=null;
//		
//		Login lo = new Login("계산기","메모장","calc.exe","notepad.exe"); 
//		boolean flag=true;
//		
//		while(flag){
//			System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>"); 
//			num = input.nextInt();
//			
//			switch(num){
//			
//			case 1: System.out.print("아이디 입력 : ");
//					inputId = input.next();
//					System.out.print("비밀번호 입력 : "); 
//					inputPw = input.next();
//					result = lo.compare(inputId,inputPw);
//					if(result == 0){
//						System.out.println("인증 통과");
//						lo.display();
//						System.out.println("프로그램 종료");
//						return ;
//					}
//					else  System.out.println("인증 실패");
//					break;
//            case 2: System.out.print("가입 id : "); 
//            		inputId = input.next();
//            		System.out.print("가입 pw : "); 
//            		inputPw = input.next();
//            		lo.saveId_Pw(inputId,inputPw); 
//            		System.out.println("저장 완료");
//            		break;
//            case 3: flag=lo.out();
//            		System.out.println("종료 합니다");
//        }
//    }
//}
//
//}
