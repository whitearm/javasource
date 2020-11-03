import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °ª : ");
		int first = s.nextInt();
		System.out.print("(1)µ¡¼À (2)»¬¼À (3)°ö¼Á (4)³ª´°¼À => ");
		int operator = s.nextInt();
		System.out.print("µÎ¹øÂ° °ª : ");
		int second = s.nextInt();
		int result;
		String op;
		if(operator == 1) {
			result = first + second;
			op = "+";
		}
		else if(operator == 2) {
			result = first - second;
			op = "-";
		}
		else if(operator == 3) {
			result = first * second;
			op = "*";
		}
		else { 
			result = first / second;
			op = "/";
		}
		System.out.println(first + op + second + " = " + result);
	}

}
