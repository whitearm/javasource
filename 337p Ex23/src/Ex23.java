import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		String str2 = "";
		
		int count, i;
		
		System.out.printf("���ڿ� �Է� : ");
		str = s.nextLine();
		
		count = str.length();
		
		for(i = 0; i < count; i++) {
			str2 += str.charAt(count - (i+1));
		}
		
		System.out.printf("�Ųٷ� ��� : %s \n", str2);
	}

}
