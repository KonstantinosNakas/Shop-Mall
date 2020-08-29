
public class Shop {

	private String name;
	private int years;
	private double revenue;
	private String[] employees = new String[100];
	private boolean eshop;
	
	public Shop(String name, int years) {
		this.name = name;
		this.years = years;
	}
	
	public Shop(String name, int years, double revenue, boolean eshop) {
		this.name = name;
		this.years = years;
		this.revenue = revenue;
		this.eshop = eshop;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYears() {
		return years;
	}
	
	public double getRevenue() {
		return revenue;
	}
	
	public boolean getEshop() {
		return eshop;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	public void setEshop(boolean eshop) {
		this.eshop = eshop;
	}
	
	public void addEmployee(String employee) {
		if (employees[99] != null) {
			System.out.println("Den xwrane alloi upallhloi");
			return;
		}
		for (int i=0; i<100; i++) {
			if (employees[i] == null) {
				employees[i] = employee;
				break;
			}
		}
	}
	
	public String[] getEmployees() {
		return employees;
	}
	
	public void show() {
		System.out.println("To onoma einai: " + name);
		System.out.println("To xronia leitourias einai: " + years);
		System.out.println("O tziros einai: " + revenue);
		System.out.println("Exei eshop: " + eshop);
		System.out.println("Oi upallhloi pou exei einai: ");
		for (int i=0; i<100; i++) {
			if (employees[i] == null) {
				break;
			}else {
				System.out.println("O upallhlos me onoma: " + employees[i]);
			}
		}
	}
	
}
