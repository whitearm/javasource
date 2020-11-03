class car{
	String color;
	int speed;
	static int count = 0;
	
	car(){
	count++;
	// car 인스턴스가 출력 될 때마다 호출됨
	}
}

public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car mycar1 = new car();
		System.out.println("현재 생산된 자동차 숫자 : " + mycar1.count);
	
		car mycar2 = new car();
		System.out.println("현재 생산된 자동차 숫자 : " + mycar2.count);
		
		car mycar3 = new car();
		System.out.println("현재 생산된 자동차 숫자 : " + car.count);
		
	}

}
