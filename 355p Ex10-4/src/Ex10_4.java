
public class Ex10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 0;
				int result;
		try {
		if (b == 0)
			throw new Exception("0으로 안나눠진다");
	
		result = a / b;
		
	}catch(Exception e) {
		System.out.print("발생오류 : ");
		System.out.print(e.getMessage());
	}
	}

}
