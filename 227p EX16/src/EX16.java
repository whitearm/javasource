import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		int str_cnt;
		int i;
		
		System.out.printf("���� �Է� : ");
		str = s.nextLine();
		
		System.out.printf("\n");
		System.out.printf("�Է��� ���ڿ� : %s\n", str);
		System.out.printf("��ȯ�� ���ڿ� : ");
		
		str_cnt = str.length();
		
		for(i = str_cnt-1; i >= 0; i--) { //�� �𸣰����� length ���� 1 �۾ƾ� �Ѵٰ� ���� �Ұ�
			System.out.printf("%C", str.charAt(i));// charAt(i)�� ()���� �ε��� ���� ��� ex) charAt(3)�̸��� 3��°�� ����
			// ���� charAt(i)�� i��°�� �����
			
		}
		
	}

}
