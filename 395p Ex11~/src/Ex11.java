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
		myCar1.color ="��";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color ="��";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color ="��";
		myCar3.speed = 0;
		
		myCar1.upspeed(30);
		System.out.println("�ڵ���1�� ���� " + myCar1.color + "�̸�, ���� �ӵ���" + myCar1.speed + "�Դϴ�");
		
		myCar2.upspeed(60);
		System.out.println("�ڵ���2�� ���� " + myCar2.color + "�̸�, ���� �ӵ���" + myCar2.speed + "�Դϴ�");
		
		myCar3.upspeed(0);
		System.out.println("�ڵ���3�� ���� " + myCar3.color + "�̸�, ���� �ӵ���" + myCar3.speed + "�Դϴ�");
		

	}

}
