import java.util.Scanner;

public class MallProgram {

	public static void main(String[] args) {
		int numberOfShops;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Dwse arithmo katasthmatwn gia to Mall");
		numberOfShops = keyboard.nextInt();
		System.out.println("Dwse onoma tou Mall");
		String name = keyboard.next();
		System.out.println("Dwse xronia leitourgias tou Mall");
		int years = keyboard.nextInt();
		System.out.println("Dwse tziro gia to Mall");
		double revenue = keyboard.nextDouble();
		System.out.println("Dwse eshop gia to Mall");
		boolean eshop = keyboard.nextBoolean();
		Mall myMall = new Mall(name,years,revenue,eshop);
		myMall.setNumShops(numberOfShops);
		
		for (int i=0; i<numberOfShops; i++) {
			System.out.println("Dwse onoma katasthmatos");
			name = keyboard.next();
			System.out.println("Dwse xronia leitourgias katasthmatos");
			years = keyboard.nextInt();
			System.out.println("Dwse tziro katasthmatos");
			revenue = keyboard.nextDouble();
			System.out.println("Dwse eshop katasthmatos");
			eshop = keyboard.nextBoolean();
			Shop myShop = new Shop(name,years,revenue,eshop);
			System.out.println("Dwse arithmo upallhlwn katasthmatos");
			int numEmployees = keyboard.nextInt();
			for (int j=0; j<numEmployees; j++) {
				System.out.println("Dwse onoma upallhlou");
				String employeeName = keyboard.next();
				myShop.addEmployee(employeeName);
			}
			myMall.addShop(myShop);
		}	
		myMall.show();
		keyboard.close();
	}
	
}
