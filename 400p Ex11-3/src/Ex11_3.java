class Car{
	private String color;
	private int speed;
	
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
	void setColor(String color) {
		this.color = color ;
	}
	void setspeed(int speed) {
		this.speed = speed;
	}
}
	
public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		myCar1.setColor("��");
		myCar1.setspeed(0);
		
		myCar1.upspeed(30);
		System.out.println("�ڵ���1�� ���� " + myCar1.getColor() + "�̸�, ���� �ӵ���" + myCar1.getspeed() + "�Դϴ�");
		

	}

}
