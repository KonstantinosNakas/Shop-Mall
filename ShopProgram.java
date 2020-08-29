import java.util.Scanner;

public class ShopProgram {

	public static void main(String[] args) {
		int numberOfShops;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Dwse arithmo katasthmatwn");
		numberOfShops = keyboard.nextInt();
		Shop shops[] = new Shop[numberOfShops];
		
		for (int i=0; i<numberOfShops; i++) {
			System.out.println("Dwse onoma");
			String name = keyboard.next();
			System.out.println("Dwse xronia leitourgias");
			int years = keyboard.nextInt();
			System.out.println("Dwse tziro");
			double revenue = keyboard.nextDouble();
			System.out.println("Dwse eshop");
			boolean eshop = keyboard.nextBoolean();
			Shop myShop = new Shop(name,years,revenue,eshop);
			System.out.println("Dwse arithmo upallhlwn");
			int numEmployees = keyboard.nextInt();
			for (int j=0; j<numEmployees; j++) {
				System.out.println("Dwse onoma upallhlou");
				String employeeName = keyboard.next();
				myShop.addEmployee(employeeName);
			}
			shops[i] = myShop;
		}	
		for (int i=0; i<numberOfShops; i++) {
			shops[i].show();
		}
		keyboard.close();
	}
	
}
