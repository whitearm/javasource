package shopping;

public class CellPhone extends Product {
	
	private String carrier;
	
	

	public CellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}



	@Override
	void printExtra() {
		System.out.println("��Ż� ���� : "+carrier);
		// TODO Auto-generated method stub

	}

}
