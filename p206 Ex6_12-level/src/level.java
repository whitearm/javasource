import java.util.Scanner;

public class level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i;
		int gugudan;
		
		System.out.printf("�� :");
				gugudan = s.nextInt();
		
		for(i = 1; i <= 10; i++) 
		
		System.out.printf("%d x %d = %d ", gugudan , i , gugudan * i );
		//"%d X %d = %d " �� "%d X %d = %d" �� ���� ���� �ȵǰ� �ٸ��� ���ϴ� ���� ��� ���ؼ��� ������ �ֵ���ǥ ������ ���Ⱑ �ʿ��ϴ�
		
	}

}
