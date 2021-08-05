
public class Food extends Items{
	
	private String[] foodList = {"Pizza", "Chips", "Cookies (24)" , "Cookies (12)", "Salsa"};
	private double[] foodPrices = {13,8,11,8,4};
	
	public Food(double price) {
		super("Food:", price);
	}
	
	public String[] getList() {
		return foodList;
	}
	
	public double[] getListsPrice() {
		return foodPrices;
	}
}
