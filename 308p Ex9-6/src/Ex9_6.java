import java.util.Scanner;

public class Ex9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str =" 한글 AVCD efgh";
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		
		System.out.println("원 문자열 : [" + str + "]");
		System.out.println("대 문자 : [" + str.toUpperCase() + "]");
		System.out.println("소 문자 : [" + str.toLowerCase() + "]");
		System.out.println("공백제거 : [" + str.trim() + "]");

		

	}

}
