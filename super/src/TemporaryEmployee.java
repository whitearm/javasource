

public class TemporaryEmployee extends Employee {
	private double pay4Hour;
	private int workHours;
	public TemporaryEmployee(String name, String address, String telno, Date joinDate, double pay4Hour) {
		super(name, address, telno, joinDate);
		// TODO Auto-generated constructor stub
		this.pay4Hour = pay4Hour;
		this.workHours = 0;
	}
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public double payCheck() {
		return pay4Hour * workHours;
	}

}
