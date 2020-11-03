import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		int str_cnt;
		int i;
		
		System.out.printf("글자 입력 : ");
		str = s.nextLine();
		
		System.out.printf("\n");
		System.out.printf("입력한 문자열 : %s\n", str);
		System.out.printf("변환된 문자열 : ");
		
		str_cnt = str.length();
		
		for(i = str_cnt-1; i >= 0; i--) { //잘 모르겠으면 length 보다 1 작아야 한다고 생각 할것
			System.out.printf("%C", str.charAt(i));// charAt(i)는 ()안의 인덱스 값을 출력 ex) charAt(3)이면은 3번째를 추출
			// 따라서 charAt(i)는 i번째를 출력함
			
		}
		
	}

}
