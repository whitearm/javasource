class iint{
	int a;
}
public class Ex9_18 {

	static void func1(iint m) {
		m.a = m.a+1;
		System.out.printf("���޹��� a : %d\n" , m.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iint m = new iint();
		m.a = 10;
		
		func1(m);
		
		System.out.printf("func1(m) ���� ���� a : %d\n", m.a);
		

	}

}
