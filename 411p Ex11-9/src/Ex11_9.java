class calc{
	void addValue (double v1, double v2) {
		System.out.println("double값 계산 : " + (v1 + v2));
	}

	void addValue (int v1, int v2) {
		System.out.println("int값 계산 : " + (v1 + v2));
	
	}
}
public class Ex11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc mycalc = new calc();
		
		mycalc.addValue(1.0, 1.0);
		mycalc.addValue(1, 1);

		
	}

}
