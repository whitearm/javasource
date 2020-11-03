import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str = " java 망함 java";
		
		System.out.print("문자열 입력 : ");
		str = s.nextLine();
		// " java 망함 java"와 다른거를 쳐보자
		
		System.out.println("문자열 :" + str);

		System.out.print("처음에 나오는 java 위치 ");
		System.out.println(str.indexOf("java"));
		System.out.print("마지막에 나오는 java 위치 " );
		System.out.println(str.lastIndexOf("java"));
		

	}

}
