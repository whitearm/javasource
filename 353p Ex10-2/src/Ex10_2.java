
public class Ex10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aa = new int[3]; 
		try {
			aa[2] = 100;
			aa[3] = 100 / 0;
		
		}catch (ArithmeticException e) {
			//ArithmeticException �ְ� �� ���� Ŭ������ �� �ص� �ְ� �켱��, Exception�� �ֻ��� Ŭ������� ��
			System.out.println("0���� ������ �̻��� �� �ϴϱ� ������ ��");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ũ�⺸�� ū �� �־ ������ ��");
		}
		finally {
			System.out.println("�� ���ڴ� �ƹ�ư ���´�");
		}
	}

}
