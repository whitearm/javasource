import java.util.Scanner;

public class Ex9_12 {
	
	static int coffee_machine(int button) {
		System.out.printf("\n# 1.(�ڵ�����) �߰ſ� ���� �غ�");
		System.out.printf("\n# 2.(�ڵ�����) �������� �غ�\n");
		
		switch (button) {
		case 1:
			System.out.printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 2:
			System.out.printf("# 3.(�ڵ�����) ��Ŀ�Ǹ� ź��\n"); break;
		case 3:
			System.out.printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		default:
			System.out.printf("# 3.(�ڵ�����) �ƹ��ų� ź��\n"); break;
		
		}

		System.out.printf("# 4.(�ڵ�����) ���� �״´�\n");
		System.out.printf("# 5.(�ڵ�����) ���δ�\n\n");
		
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s = new Scanner(System.in);
	int coffee;
	int ret;
	
	System.out.printf("\n1�� Ŀ�� ���� (1:1, 2:2, 3:3)\n");
	coffee = s.nextInt();
	ret = coffee_machine(coffee);
	System.out.printf("\n1�� Ŀ�� ����\n");
		
	System.out.printf("\n2�� Ŀ�� ���� (1:1, 2:2, 3:3)\n");
	coffee = s.nextInt();
	ret = coffee_machine(coffee);
	System.out.printf("\n2�� Ŀ�� ����\n");
	
	System.out.printf("\n3�� Ŀ�� ���� (1:1, 2:2, 3:3)\n");
	coffee = s.nextInt();
	ret = coffee_machine(coffee);
	System.out.printf("\n3�� Ŀ�� ����\n");
	

	}

}