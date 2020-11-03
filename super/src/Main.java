public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date joinDate = new Date(2020, 1, 1);
		RegularEmployee re = new RegularEmployee("김일", "서울시", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);

		Employee e = new RegularEmployee("김이", "부산시", "234-5678", joinDate, 4000000);
		e.displayEmployee();
		
		TemporaryEmployee te = new TemporaryEmployee("김삼", "대전시", "345-6789", joinDate, 110000);
		te.displayEmployee();
		te.setWorkHours(290);
		salary = te.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);
		
		SalesEmployee se = new SalesEmployee("김사", "인천시", "456-7890", joinDate, 1000000, 0.01);
		se.displayEmployee();
		se.setSales(150000000);
		salary = se.payCheck();
		System.out.printf("급여액 : %.0f 원\n", salary);
	}

}
