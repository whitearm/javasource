class car{
	String color;
	int speed;
	static private int count = 0;
	
	car(){
		count++;
	}
	
	static int getcount() {
		return count;
	}
	
	
}
public class Ex11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� ����� �ڵ��� �� : " + car.getcount());
		
		car mycar1 = new car();
		System.out.println("���� ����� �ڵ��� �� : " + mycar1.getcount());
		
	}

}
