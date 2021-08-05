
public abstract class Items {
   
	private String type;
	static double price;
	
	public Items(String type,double cost) {
		this.type = type;
		Items.price = cost;
	}
	
	public double getCost() {
		return price;
	}
	
	public abstract String[] getList(); 
	public abstract double[] getListsPrice();
	
	public void printList(){
		System.out.println(type);
		int y = 0;
		for(String x:getList()) {
			System.out.printf(x + ": $%.2f", getListsPrice()[y]);
			System.out.println();
			y++;
		}
	}
	
	public void printInfo(String item) {
		System.out.printf(item + ": $%.2f", price);
		System.out.println();
	}
}
