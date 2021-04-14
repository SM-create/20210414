package Class;

public class Member {

	//필드
	String id , password, name;
	int age;

	//기본생성자 선언
	Member() {
		
		System.out.println("기본생성자 출력");
	}
	
	//매개변수 생성자 선언
	Member(String name, String password ,String id , int age){
		
		System.out.println("매개변수가 있는 생성자");
		this.name=name;
		this.password = password;
		this.id = id;
		this.age =age;
	}
	
	//info메소드 리턴없음,매개변수없음

	void info() {
		System.out.println("리턴없는 메소드");
		System.out.println(this.age);
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
	}
	
	void update(String name) {
		this.age =age;
		this.id =id;
		this.password=password;
	}
	
	String myName() {
		
		
		return name;
	}
	
	
}
