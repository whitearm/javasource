import java.util.Scanner;

public class Ex7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int menu;
		
		do {
			System.out.printf("\n¿œ ¿Ã ªÔ ªÁ ? \n");
			System.out.printf("<1>¿œ <2>¿Ã <3>ªÔ <4>ªÁ");
			
			menu = s.nextInt();
			
			switch (menu) {
			case 1:
				System.out.printf("¿œ\n"); break;
			case 2:
				System.out.printf("¿Ã\n"); break;
			case 3:
				System.out.printf("ªÔ\n"); break;
			case 4:
				System.out.printf("ªÁ\n"); break;
			}
		} while(menu != 4);
	}

}
