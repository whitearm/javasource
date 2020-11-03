import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
Scanner s = new Scanner(System.in);
		
		String str =" 한글 AVCD efgh";
		String result = "";
		
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) !=' ')
				result += str.substring(i,i+1);
		}
			System.out.println("원 문자열 : [" + str + "]");
			System.out.println("공백제거 :  ["+ result + "]");
		
		

	}

}
