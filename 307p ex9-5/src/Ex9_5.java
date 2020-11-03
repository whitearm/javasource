import java.util.Scanner;

public class Ex9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		String str,strrep,strsub,strAry[];
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();

		strrep = str.replace("","$");
		strsub = str.substring(3,8);
		strAry = str.split("");
		
		System.out.println("입력 바꿀거 : " + str);
		System.out.println("바꾼 문자열 : " + strrep);
		System.out.println("일부 문자열 : " + strsub);
		for (int i = 0; i < strAry.length; i++)
		System.out.println("분리한 문자열 " + i + " : " + strAry[i]);
	}

}
