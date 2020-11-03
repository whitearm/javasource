

public class RegularEmployee extends Employee {
	protected double salary;		// 급여액
	public RegularEmployee(String name, String address, String telno, Date joinDate, double salary) {
		super(name, address, telno, joinDate);
		this.salary = salary;
	}
	public double payCheck() {	// 급여 계산
		return salary;
	}
}
