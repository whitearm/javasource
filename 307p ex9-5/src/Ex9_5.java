import java.util.Scanner;

public class Ex9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		String str,strrep,strsub,strAry[];
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();

		strrep = str.replace("","$");
		strsub = str.substring(3,8);
		strAry = str.split("");
		
		System.out.println("�Է� �ٲܰ� : " + str);
		System.out.println("�ٲ� ���ڿ� : " + strrep);
		System.out.println("�Ϻ� ���ڿ� : " + strsub);
		for (int i = 0; i < strAry.length; i++)
		System.out.println("�и��� ���ڿ� " + i + " : " + strAry[i]);
	}

}
