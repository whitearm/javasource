import java.util.Scanner;

public class REVERSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i;
		int gugudan;
		
		System.out.printf("´Ü :");
				gugudan = s.nextInt();
		
		for(i = 9; i >= 1; i--) 
		
		System.out.printf("%d X %d = %d \n", gugudan , i , gugudan * i );
		
		
	}

}
