
public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 0; i < 128; i++) {
			if(i % 16 == 0) {
				System.out.printf("------------------------\n");
				System.out.printf("10����	 16����	  ���� \n");
				System.out.printf("------------------------\n");
				}
			System.out.printf("%5d	%5x	%5c\n", i, i, i);
		}
		

	}

}
