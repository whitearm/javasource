import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = " java ���� java";
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		// " java ���� java"�� �ٸ��Ÿ� �ĺ���
		
		System.out.println("���ڿ� :" + str);

		System.out.print("ó���� ������ java ��ġ ");
		System.out.println(str.indexOf("java"));
		System.out.print("�������� ������ java ��ġ " );
		System.out.println(str.lastIndexOf("java"));
		

	}

}
