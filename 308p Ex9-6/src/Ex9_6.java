import java.util.Scanner;

public class Ex9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str =" �ѱ� AVCD efgh";
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		
		System.out.println("�� ���ڿ� : [" + str + "]");
		System.out.println("�� ���� : [" + str.toUpperCase() + "]");
		System.out.println("�� ���� : [" + str.toLowerCase() + "]");
		System.out.println("�������� : [" + str.trim() + "]");

		

	}

}
