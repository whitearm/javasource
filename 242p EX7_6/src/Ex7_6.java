import java.util.Scanner;

public class Ex7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int menu;
		
		do {
			System.out.printf("\n�� �� �� �� ? \n");
			System.out.printf("<1>�� <2>�� <3>�� <4>��");
			
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				System.out.printf("��\n"); break;
			case 2:
				System.out.printf("��\n"); break;
			case 3:
				System.out.printf("��\n"); break;
			case 4:
				System.out.printf("��\n"); break;
			}
		} while(menu != 4);
	}

}
