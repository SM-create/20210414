package Class;

public class Student_Main_Day1 {

	public static void main(String[] args) {
		
		
		

		// 1. 기본생성자를 이용한 객체선언
		
		Student_Day1 stu1 = new Student_Day1(); 

		stu1.name = "학생1";
		stu1.stuNum = 12345;
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		
		
		
		// 2. 매개변수가 있는 생성자를 이용한 객체선언

		// student stu2 =new Student ();
		// 괄호의 클래스 순서는 동일해야함
		
		Student_Day1 stu2 = new Student_Day1("학생2", 11111);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		
		
		
//		Ex.1 Student stu2 =new Student("학생2",11111);

//		System.out.println(stu1.name);
//		System.out.println(stu1.stuNum);
		
		
		
		
		// 3. fieldPrint 메소드 호출
		
		System.out.println("메소드 호출전");
		
		stu1.fieldPrint();
		
		System.out.println("메소드 호출끝");
		
		stu2.fieldPrint();
		
		
		Student_Day1 stu3 = new Student_Day1("학생3", 22222);
		stu3.fieldPrint();
		System.out.println("fieldprint");
		
		
	
		//Retrun이 있는 메소드
		
		System.out.println("return이 있는 메소드 호출");
		
		stu1.numberMethod();
		
		int aa=0;
		System.out.println(aa); //메소드 호출전
		aa = stu1.numberMethod();
		System.out.println(aa); //메소드 호출후
		
		System.out.println(stu2.numberMethod()); // 괄호안에서도 가능
		
		
		System.out.println("string메소드호출"); //string문에서도 적용가능함
		System.out.println(stu3.StringMethod());
		
		String bb= stu3.StringMethod();
		System.out.println(bb);
		
		
		
		Student_Day1 stu4 =new Student_Day1 ();
		int cc= stu4.numberMethod2(30);  //numberMethod2의 num1이 =30
		System.out.println(cc); // num1+num2= //따라서 결과값은 sum값인 40이 나옴
		
		
		int number1 =50;
		cc =stu4.numberMethod2(number1);
		System.out.println(cc);  //같은 이유로 60이나옴
		
	}

}
