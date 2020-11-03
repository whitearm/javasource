
public class Ex9_17 {
	
	static void func1(int a) {
		a = a + 1;
		System.out.printf("전달받은 a : %d\n", a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		func1(a);
		
		System.out.printf("func() 실행 후 a : %d\n", a);
	}

}
