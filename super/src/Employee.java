

public class Employee {
	private String name;  	// 이름
	private String address;	// 주소
	private String telno;	// 전화번호
	private Date joinDate;	// 입사일자
	
	public Employee(String name, String address, String telno, Date joinDate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joinDate = joinDate;
	}
	
	public void displayEmployee() { // 사원정보 표시
		System.out.printf("이름 : %s, 주소 : %s, 전화번호 : %s, 입사일자 : %s\n",  
						  name, address, telno, joinDate);
	}
}
