package Class;

public class Student_Day1 {

	// �ʵ�

	String name;
	int stuNum;

	/*
	 * �����ڸ� �ƹ��͵� ����������� = �⺻������ ������ 
	 * �⺻������ ���°� �ƴ� �����ڸ� �����ϸ� 
	 * �⺻�����ڸ� �� �� ����. �⺻�����ڸ�
	 * ����Ϸ��� �������Ǹ� �������.
	 */

	// 1. �⺻������ ����
	
	Student_Day1() {
		System.out.println("�⺻������ ȣ��");
	}
	

	// 2. �Ű������� �ִ� ������ ����
	
	Student_Day1(String name, int stuNum) {
		System.out.println("�Ű������� �ִ� ������ ȣ��");
		this.name = name;
		this.stuNum = stuNum;

	}
	

	//��ȣ�� ������ �ٲ���� ���� ���Ǹ� �ؾ��Ѵ�.
	
//		Student(int stNum, String name){

//			this.name=name;
//			this.stuNum=stuNum;

//		}
	
	

	
	// 3.�޼ҵ� ����

	/*
	 * // void ������ ���ٴ� �ǹ� 
	 * �޼ҵ� �̸� : fieldPrint 
	 * �Ű����� : ����
	 */

	// 1.������ ���� �޼ҵ� (=void)

	void fieldPrint() {
		System.out.println("return���� �޼ҵ� ȣ���");
		System.out.println(this.name);
		System.out.println(this.stuNum);

	}

	// 2.������ �ִ� �޼ҵ�
	/*
	 * int: ���ϵǴ� ���� int
	 * �޼ҵ� �̸��� :numberMethod
	 * �Ű����� : ����
	 */
	
	int numberMethod() {
		int num=10; //������ ����
		return num; //num������ ���� ���� ��������
		
	}
	
	
	
	
	
	
	/*
	 *  String :���ϵǴ°��� String
	 *  �޼ҵ� �̸�: stringMethod
	 *  �Ű����� : ����
	 */
	
	String StringMethod() {
		String val ="Return��";
		return val ;
		
	}
	
	// �Ű������� �ִ� �޼ҵ�
	
	int numberMethod2 (int num1) {
		int num2= 10;
		int sum= num1+ num2;
				return sum;
	}
	
}




