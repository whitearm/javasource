import java.util.Scanner;

public class Ex9_11 {
	static int coffee_machine(int button) {
		System.out.printf("\n# 1.(자동으로) 뜨거운 물을 준비");
		System.out.printf("\n# 2.(자동으로) 종이컵을 준비\n");
		
		switch (button) {
		case 1:
			System.out.printf("# 3.(자동으로) 보통커피를 탄다\n"); break;
		case 2:
			System.out.printf("# 3.(자동으로) 흰커피를 탄다\n"); break;
		case 3:
			System.out.printf("# 3.(자동으로) 검은커피를 탄다\n"); break;
		default:
			System.out.printf("# 3.(자동으로) 아무거나 탄다\n"); break;
		
		}

		System.out.printf("# 4.(자동으로) 물을 붓는다\n");
		System.out.printf("# 5.(자동으로) 녹인다\n\n");
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int coffee;
		int ret;
		
		System.out.printf("어떤 커피? (1:1,2:2,3:3)");
		coffee = s.nextInt();
		
		ret = coffee_machine(coffee);
		
		System.out.printf("커피나옴.\n");
		
	}

}
