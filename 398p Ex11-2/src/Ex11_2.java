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
		myCar1.color ="��";
		myCar1.speed = 0;
		
		myCar1.upspeed(30);
		System.out.println("�ڵ���1�� ���� " + myCar1.color + "�̸�, ���� �ӵ���" + myCar1.speed + "�Դϴ�");
		System.out.println("�ڵ���1�� ���� " + myCar1.getColor() + "�̸�, ���� �ӵ���" + myCar1.getspeed() + "�Դϴ�");
		

	}

}
