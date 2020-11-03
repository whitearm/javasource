import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값 :");
		int a = s.nextInt();
		
		System.out.print("두번째 계산할 값 :");
		int b = s.nextInt();
		
		System.out.print("세번째 계산할 값 :");
		int c = s.nextInt();
		
		System.out.print("네번째 계산할 값 :");
		int d = s.nextInt();
		
		int result = a + b + c + d;
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);

	}

}
