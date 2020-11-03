import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first = s.nextInt();
		System.out.print("+ - * / % : ");
		char operator = (char) System.in.read();
		System.out.print("두번째 값");
		int second = s.nextInt();
		int result = -1;
		boolean b = true;
		String op;
		if(operator == '+') {
			result = first + second;
			op = "+";
		}
		else if (operator == '-') {
			result = first - second;
			op = "-";
		}
		else if (operator == '*') {
			result = first + second;
			op = "*";
		}
		else if (operator == '/'){
			if(second == 0) {
				System.out.println("0 쓰지마십시오");
				b = false;
			}
				else
					result = first / second;
				op = "/";				
		}
		else {
			if(second == 0) {
				System.out.println("0 쓰면 안됩니다.");
				result = 0;
				b = false;
			}
			else
				result = first % second;
			op = "%";
			
		}
		if(b == true)
			System.out.println(first + op + second + " = " + result);
		
	}
}
