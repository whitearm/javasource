import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer;
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 :");
		
		integer = s.nextInt();
		
		System.out.printf("10 : %d \n" , integer);
		System.out.printf("16 : %x \n" , integer);
		System.out.printf("8 : %o \n" , integer);
	}

}
