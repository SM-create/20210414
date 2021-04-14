package Class;

public class Cal_Ex1 {

	int num1;   
	int num2;
	
	//메소드를 정의 할때 1. 리턴타입, 메소드이름, 매개변수유무  2.실행내용(리턴유무)순으로 고려 

	// sum1 리턴X

	void sum1(int num1, int num2) {  //리턴이 없기때문에 void로 시작

		System.out.println(num1 + num2); //리턴이 없기 때문에 바로출력이가능

	}

	// sum2 리턴O
 
	int sum2(int num1, int num2) {  //리턴이 있기 때문에 int문으로 시작
		int sum = num1 + num2;  //원하는 출력값이 sum이고 리턴이 있기때문에 int sum타입을 적용함
		return sum; //리턴
	}
}

