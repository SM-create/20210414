package Class;

public class Member_Main {

	public static void main(String[] args) {

		//�⺻������ ��ü����
		Member mem =new Member();
		
		mem.name="�ּ���";
		mem.password="12345";
		mem.id="id";
		System.out.println(mem.name);
		System.out.println(mem.password);
		System.out.println(mem.id);
				
		//�Ű����� ������ ��ü����
		Member mem1= new Member("�ּ���","54321", "ID" ,123);
				
		System.out.println(mem1.age);
		System.out.println(mem1.id);
		System.out.println(mem1.password);
		System.out.println(mem1.name);
		
		//�޼ҵ� info
		
		//�޼ҵ� update
		
		Member mem1= new Member ();
		mem1.update();
		
		
		
		
		
	}

}
