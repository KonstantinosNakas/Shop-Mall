
public class Mall extends Shop {

	private int numShops;
	private Shop shops[];
	
	public Mall(String name, int years) {
		super(name,years);
	}
	
	public Mall(String name, int years, double revenue, boolean eshop) {
		super(name,years,revenue,eshop);
	}
	
	public void setNumShops(int numShops) {
		this.numShops = numShops;
		shops = new Shop[numShops];
	}
	
	public int getNumShops() {
		return numShops;
	}
	
	public int getOldestShopYears() {
		int years = 0;
		for (int i=0; i<numShops; i++) {
			if (shops[i].years > years) {
				years = shops[i].years;
			}
		}
		return years;
	}
	
	public void addShop(Shop a) {
		if (shops[numShops-1] != null) {
			System.out.println("Den xwraei allo katasthma");
			return;
		}
		for (int i=0; i<numShops; i++) {
			if (shops[i] == null) {
				shops[i] = a;
				break;
			}
		}
	}
	
	public void show() {
		System.out.println("To onoma tou Mall einai: " + name);
		System.out.println("To xronia leitourias tou Mall einai: " + years);
		System.out.println("O tziros tou Mall einai: " + revenue);
		System.out.println("To Mall exei eshop: " + eshop);
		for (int i=0; i<numShops; i++ ) {
			int numKatasthmatos = i+1;
			System.out.println("Gia to katasthma noumero: " + numKatasthmatos + " exoume:");
			System.out.println("To onoma einai: " + shops[i].name);
			System.out.println("To xronia leitourias einai: " + shops[i].years);
			System.out.println("O tziros einai: " + shops[i].revenue);
			System.out.println("Exei eshop: " + shops[i].eshop);
			System.out.println("Oi upallhloi pou exei einai: ");
			for (int j=0; j<100; j++) {
				if (shops[i].employees[j] == null) {
					break;
				}else {
					System.out.println("O upallhlos me onoma: " + shops[i].employees[j]);
				}
			}
		}	
	}
	
}
