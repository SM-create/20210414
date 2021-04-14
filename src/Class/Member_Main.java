package Class;

public class Member_Main {

	public static void main(String[] args) {

		//기본생성자 객체선언
		Member mem =new Member();
		
		mem.name="최성민";
		mem.password="12345";
		mem.id="id";
		System.out.println(mem.name);
		System.out.println(mem.password);
		System.out.println(mem.id);
				
		//매개변수 생성자 객체선언
		Member mem1= new Member("최성민","54321", "ID" ,123);
				
		System.out.println(mem1.age);
		System.out.println(mem1.id);
		System.out.println(mem1.password);
		System.out.println(mem1.name);
		
		//메소드 info
		
		//메소드 update
		
		Member mem1= new Member ();
		mem1.update();
		
		
		
		
		
	}

}
