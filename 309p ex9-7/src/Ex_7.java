import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
Scanner s = new Scanner(System.in);
		
		String str =" �ѱ� AVCD efgh";
		String result = "";
		
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) !=' ')
				result += str.substring(i,i+1);
		}
			System.out.println("�� ���ڿ� : [" + str + "]");
			System.out.println("�������� :  ["+ result + "]");
		
		

	}

}
