package Class;

public class Student_Day1 {

	// 필드

	String name;
	int stuNum;

	/*
	 * 생성자를 아무것도 쓰지않을경우 = 기본생성자 이지만 
	 * 기본생성자 형태가 아닌 생성자를 정의하면 
	 * 기본생성자를 쓸 수 없음. 기본생성자를
	 * 사용하려면 따로정의를 해줘야함.
	 */

	// 1. 기본생성자 선언
	
	Student_Day1() {
		System.out.println("기본생성자 호출");
	}
	

	// 2. 매개변수가 있는 생성자 선언
	
	Student_Day1(String name, int stuNum) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.stuNum = stuNum;

	}
	

	//괄호의 순서가 바뀌려면 따로 정의를 해야한다.
	
//		Student(int stNum, String name){

//			this.name=name;
//			this.stuNum=stuNum;

//		}
	
	

	
	// 3.메소드 선언

	/*
	 * // void 리턴이 없다는 의미 
	 * 메소드 이름 : fieldPrint 
	 * 매개변수 : 없음
	 */

	// 1.리턴이 없는 메소드 (=void)

	void fieldPrint() {
		System.out.println("return없는 메소드 호출됨");
		System.out.println(this.name);
		System.out.println(this.stuNum);

	}

	// 2.리턴이 있는 메소드
	/*
	 * int: 리턴되는 값이 int
	 * 메소드 이름이 :numberMethod
	 * 매개변수 : 없음
	 */
	
	int numberMethod() {
		int num=10; //정수형 변수
		return num; //num변수가 가진 값을 리턴해줌
		
	}
	
	
	
	
	
	
	/*
	 *  String :리턴되는값이 String
	 *  메소드 이름: stringMethod
	 *  매개변수 : 없음
	 */
	
	String StringMethod() {
		String val ="Return값";
		return val ;
		
	}
	
	// 매개변수가 있는 메소드
	
	int numberMethod2 (int num1) {
		int num2= 10;
		int sum= num1+ num2;
				return sum;
	}
	
}




