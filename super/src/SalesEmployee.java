

public class SalesEmployee extends RegularEmployee {
	private double rate;
	private double sales;
	public SalesEmployee(String name, String address, String telno, Date joinDate, double salary, double rate) {
		super(name, address, telno, joinDate, salary);
		// TODO Auto-generated constructor stub
		this.rate = rate;
		this.sales = 0;
	}
	
	public void setSales(double sales) {
		this.sales = sales;
	}
	
	public double payCheck() {
		// get salary from super class
		// multiply rate and sales.
		// add salary and record.
		return super.salary + (rate * sales);
	}

}
