class employee {
	public Employee(String name, String address, String telno Date joindate){
		
	}
	public void displayEmployee() {
		
	}
	private String name;
	private String address;
	private String telno;
	private Date joindate;

}

public class Employee {
	private String name;
	private String empNumber;
	private String telno;
	private Date birthday;
	private String address;
	private String email;
	private double pay;
	
	public Employee(String name, String empNumber, String email, Date birthday) {
		this.name = name;
		this.empNumber = empNumber;
		this.email = email;
		this.birthday = birthday;
		this.address = "homeless";
		this.telno = "";
		this.pay = 0.0;
	}

	public String getName() {
		return name;
	}
	
	public String getEmpNumber() {
		return empNumber;
	}
	
	public String getBasicInfo() {
		return String.format("�����ȣ : %s, �̸� : %s", empNumber, name);
	}
	
	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBirthday( ) {
		return String.format("%04d-%02d-%02d", birthday.getYear(), birthday.getMonth(), birthday.getDay());
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public void displayEmployee() {
		System.out.printf("�̸� : %s, �����ȣ : %s, �̸��� : %s, ������� : %s ��ȭ��ȣ : %s, �ּ� : %s, �޿� : %f\n",  
						  name, empNumber, email, birthday, telno, address, pay);
		
	}
	
	
}
