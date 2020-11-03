class Car{
	String color;
	int speed;
	
	void upspeed(int value) {
		speed = speed + value;
	}
	void downspeed(int value) {
		speed = speed - value;
	}


String getColor() {
		return color;
	}
	int getspeed() {
		return speed;
	}
}
	
public class Ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		myCar1.color ="빨";
		myCar1.speed = 0;
		
		myCar1.upspeed(30);
		System.out.println("자동차1의 색은 " + myCar1.color + "이며, 현재 속도는" + myCar1.speed + "입니다");
		System.out.println("자동차1의 색은 " + myCar1.getColor() + "이며, 현재 속도는" + myCar1.getspeed() + "입니다");
		

	}

}
