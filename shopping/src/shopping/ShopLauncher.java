package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyShop shop = new MyShop();
		
		shop.setTitle("shopname");

		shop.genUser();
		
		shop.genProduct();
		
		shop.start();
	}

}
