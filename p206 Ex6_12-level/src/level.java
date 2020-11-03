import java.util.Scanner;

public class level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i;
		int gugudan;
		
		System.out.printf("단 :");
				gugudan = s.nextInt();
		
		for(i = 1; i <= 10; i++) 
		
		System.out.printf("%d x %d = %d ", gugudan , i , gugudan * i );
		//"%d X %d = %d " 와 "%d X %d = %d" 의 값이 말도 안되게 다르다 원하는 값을 얻기 위해서는 마지막 쌍따옴표 이전에 띄어쓰기가 필요하다
		
	}

}
