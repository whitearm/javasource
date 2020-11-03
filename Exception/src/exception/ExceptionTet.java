package exception;

public class ExceptionTet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력값을 다시 확인해주세요")
		}

	}

	}

}
