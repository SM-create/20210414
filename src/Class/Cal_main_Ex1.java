package Class;

public class Cal_main_Ex1 {

	public static void main(String[] args) {

		// 메소드를 정의할때
		Cal_Ex1 cal1 = new Cal_Ex1(); // cal1이라는 임의의 변수로 정의

		// 리턴이 없는 메소드호출
		cal1.sum1(10, 20); // 임의의 변수 cla1.sum1(); 의 값을 대입함.

		// 리턴이 있는 메소드호출
		int sum = cal1.sum2(10, 20); // int sum= 을 제외하면 리턴이 없는 메소드와비슷하다. 
		System.out.println(sum); // sum출력

	}

}


