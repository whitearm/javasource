class Car{
	String color;
	int speed;
	
	void upspeed(int value) {
		speed = speed + value;
	}
	void downspeed(int value) {
		speed = speed - value;
	}
	
	
	
	
}


public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		myCar1.color ="빨";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color ="파";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color ="노";
		myCar3.speed = 0;
		
		myCar1.upspeed(30);
		System.out.println("자동차1의 색은 " + myCar1.color + "이며, 현재 속도는" + myCar1.speed + "입니다");
		
		myCar2.upspeed(60);
		System.out.println("자동차2의 색은 " + myCar2.color + "이며, 현재 속도는" + myCar2.speed + "입니다");
		
		myCar3.upspeed(0);
		System.out.println("자동차3의 색은 " + myCar3.color + "이며, 현재 속도는" + myCar3.speed + "입니다");
		

	}

}
