package cls;

public class Class4 {
	public static void main(String[] args) {
	// 1. 객체화
	// 2. setStr을 써서 글자를 씀
	// 3. getStr을 써서 사용
		
		MyClass8 mc8 = new MyClass8();
		mc8.setStr("담기!");
		mc8.getStr();
		
		
	}
}

class MyClass8{
	// 클래스 : 변수와 함수를 뭉쳐놓은 것
	// 변수 ==> 멤버면수
	// 함수 ==> 메서드
	String str; 	// 클래스에 있는 변수는 '클래스 멤버변수'라고 한다
	
	void func() {} 		// 클래스에 있는 함수는 '메서드' 라고 한다
		
	
	// 클래스 기원: 초보자를 위해서(초보자에게 코드를 교육하지 않고 사용하게 하기 위해서)
	// this (포인터)
	void setStr(, String str) {
		// str변수에 값을 담는 함수
		str = str;
	}

	String getStr() {		// 클래스명 this
		// str 변수를 사용하는 함수
		System.out.println(str);
		return str;
		
	}
}
