package Class;

public class Member {

	//�ʵ�
	String id , password, name;
	int age;

	//�⺻������ ����
	Member() {
		
		System.out.println("�⺻������ ���");
	}
	
	//�Ű����� ������ ����
	Member(String name, String password ,String id , int age){
		
		System.out.println("�Ű������� �ִ� ������");
		this.name=name;
		this.password = password;
		this.id = id;
		this.age =age;
	}
	
	//info�޼ҵ� ���Ͼ���,�Ű���������

	void info() {
		System.out.println("���Ͼ��� �޼ҵ�");
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
