package Class;

public class Cal_Ex1 {

	int num1;   
	int num2;
	
	//�޼ҵ带 ���� �Ҷ� 1. ����Ÿ��, �޼ҵ��̸�, �Ű���������  2.���೻��(��������)������ ��� 

	// sum1 ����X

	void sum1(int num1, int num2) {  //������ ���⶧���� void�� ����

		System.out.println(num1 + num2); //������ ���� ������ �ٷ�����̰���

	}

	// sum2 ����O
 
	int sum2(int num1, int num2) {  //������ �ֱ� ������ int������ ����
		int sum = num1 + num2;  //���ϴ� ��°��� sum�̰� ������ �ֱ⶧���� int sumŸ���� ������
		return sum; //����
	}
}

