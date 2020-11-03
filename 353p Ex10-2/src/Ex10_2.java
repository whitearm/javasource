
public class Ex10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aa = new int[3]; 
		try {
			aa[2] = 100;
			aa[3] = 100 / 0;
		
		}catch (ArithmeticException e) {
			//ArithmeticException 애가 더 상위 클래스라 뭘 해도 애가 우선임, Exception이 최상위 클래스라고 함
			System.out.println("0으로 나누는 이상한 짓 하니까 오류가 남");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기보다 큰 거 넣어서 오류가 남");
		}
		finally {
			System.out.println("이 글자는 아무튼 나온다");
		}
	}

}
