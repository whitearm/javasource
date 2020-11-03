package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements iShop {
	
	private String title;
	 
	Product[] products = new Product[10];
	
	ArrayList<Product> carts = new ArrayList<Product>();
	
	User[] user = new User[2];
	
	Scanner scan = new Scanner(System.in);
	// Ctrl + space 활용
	
	int selUser;
		

	@Override
	public void setTitle(String title) {
		this.title = title;
		
		// TODO Auto-generated method stub

	}

	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user1 = new User("name", PayType.CARD);
		User user2 = new User("name2", PayType.CASH);
		
		user[0] = user1;
		user[1] = user2;

	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		products[0] = new SmartTV("1", 3000, "HD");
		products[1] = new SmartTV("2", 3000, "FHD");
		products[2] = new SmartTV("3", 3000, "UHD");
		products[3] = new SmartTV("4", 3000, "4K");
		products[4] = new SmartTV("5", 3000, "720P");
		products[5] = new CellPhone("note1", 3000, "16");
		products[6] = new CellPhone("note2", 3000, "32");
		products[7] = new CellPhone("note3", 3000, "64");
		products[8] = new CellPhone("note4", 3000, "128");
		products[9] = new CellPhone("note5", 3000, "256");
		
	
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title+" : 메인화면 = 계정선택");
		System.out.println("======================");
	
		int i = 0;
		for(User u:user) {
			System.out.printf("[%d] %s(%s)\n",i++ ,u.getName() ,u.getPaytype());
			
			
		}
		System.out.println("[x] 종 료");
		System.out.print("선택 : ");	
		
		String input = scan.next();
		switch (input) {
		case "0": case "1":
		System.out.println("###"+input+"선택 ###");
		selUser = Integer.parseInt(input);
		productList();
		break;
		case "x":case "X":
			System.out.println("shop 종료");
		default:
			System.out.println("입력값 확인");
			start();
			break;
		
		}
		
	}
	public void productList() {
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("====================");
		
		int i = 0;
		for(Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();						
		}
		System.out.println("[h] 메인");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		
		String input = scan.next();
		
		switch (input) {
		case "h":
			start();
			break;
		case "c":
			checkout();
			break;
		case "0":case "1": case "2":case "3":
		case "4":case "5": case "6":case "7":
		case "8":case "9":
			
			carts.add(products[Integer.parseInt(input)]);
			
			productList();
		default:
			break;
		}
		
	}

	public void checkout() {
		
		System.out.println(title+" : 체크아웃");
		System.out.println("====================");
		
		int i=0;
		int total=0;
		for(Product p:carts) {
			System.out.printf("[%d]%s(%s)\n", i++ ,p.getPname(),p.getPrice());
			total += p.getPrice();
			
		}
		

		System.out.println("====================");
		
		System.out.println("결제 방법 : " +user[selUser].getPaytype());
		System.out.println("합계 : "+total+" 원 입니다.");
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.print("선택 : ");
			
			
			
			
			
			
			
			
			
			
			
	}
}
