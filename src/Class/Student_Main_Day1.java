package Class;

public class Student_Main_Day1 {

	public static void main(String[] args) {
		
		
		

		// 1. �⺻�����ڸ� �̿��� ��ü����
		
		Student_Day1 stu1 = new Student_Day1(); 

		stu1.name = "�л�1";
		stu1.stuNum = 12345;
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		
		
		
		// 2. �Ű������� �ִ� �����ڸ� �̿��� ��ü����

		// student stu2 =new Student ();
		// ��ȣ�� Ŭ���� ������ �����ؾ���
		
		Student_Day1 stu2 = new Student_Day1("�л�2", 11111);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		
		
		
//		Ex.1 Student stu2 =new Student("�л�2",11111);

//		System.out.println(stu1.name);
//		System.out.println(stu1.stuNum);
		
		
		
		
		// 3. fieldPrint �޼ҵ� ȣ��
		
		System.out.println("�޼ҵ� ȣ����");
		
		stu1.fieldPrint();
		
		System.out.println("�޼ҵ� ȣ�ⳡ");
		
		stu2.fieldPrint();
		
		
		Student_Day1 stu3 = new Student_Day1("�л�3", 22222);
		stu3.fieldPrint();
		System.out.println("fieldprint");
		
		
	
		//Retrun�� �ִ� �޼ҵ�
		
		System.out.println("return�� �ִ� �޼ҵ� ȣ��");
		
		stu1.numberMethod();
		
		int aa=0;
		System.out.println(aa); //�޼ҵ� ȣ����
		aa = stu1.numberMethod();
		System.out.println(aa); //�޼ҵ� ȣ����
		
		System.out.println(stu2.numberMethod()); // ��ȣ�ȿ����� ����
		
		
		System.out.println("string�޼ҵ�ȣ��"); //string�������� ���밡����
		System.out.println(stu3.StringMethod());
		
		String bb= stu3.StringMethod();
		System.out.println(bb);
		
		
		
		Student_Day1 stu4 =new Student_Day1 ();
		int cc= stu4.numberMethod2(30);  //numberMethod2�� num1�� =30
		System.out.println(cc); // num1+num2= //���� ������� sum���� 40�� ����
		
		
		int number1 =50;
		cc =stu4.numberMethod2(number1);
		System.out.println(cc);  //���� ������ 60�̳���
		
	}

}
