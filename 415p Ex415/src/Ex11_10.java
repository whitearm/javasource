class car{
	String color;
	int speed;
	static int count = 0;
	
	car(){
	count++;
	// car �ν��Ͻ��� ��� �� ������ ȣ���
	}
}

public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car mycar1 = new car();
		System.out.println("���� ����� �ڵ��� ���� : " + mycar1.count);
	
		car mycar2 = new car();
		System.out.println("���� ����� �ڵ��� ���� : " + mycar2.count);
		
		car mycar3 = new car();
		System.out.println("���� ����� �ڵ��� ���� : " + car.count);
		
	}

}
