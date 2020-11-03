import java.util.Scanner;

public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i;
		int gugudan;
		
		System.out.printf("´Ü :");
				gugudan = s.nextInt();
		
		for(i = 1; i <= 10; i++) 
		
		System.out.printf("%d X %d = %d \n", gugudan , i , gugudan * i );
		
		
	}

}
