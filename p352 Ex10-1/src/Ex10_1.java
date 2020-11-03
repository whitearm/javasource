
public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = new int[3];
		try {
			aa[3] = 100;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기가 모자라서 오류가 났지만 무시하고 진행시킴");
		}
		
		

	}

}
