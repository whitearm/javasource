
public class Ex9_16 {
	
	static void func1() {
		System.out.printf("void 형 메소드라 돌려줄게 없음.\n");
	}

	static int func2() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		func1();
		
		a = func2();
		System.out.printf("int 형 메소드라서 돌려줌 : %d\n", a);

	}

}
