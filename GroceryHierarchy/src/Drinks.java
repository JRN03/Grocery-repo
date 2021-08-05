
public class Drinks extends Items{
   
	private String[] drinksList = {"Mountain Dew (24)","Mountain Dew (12)", "Pepsi", "Water (24)" ,"Water (12)", "Tea" , "Cerveza"};
    private double[] drinkPrices = {14,11,12,10,6,7,24};
	
	
	public Drinks(double price) {
		super("Drinks:", price);
	}
	
	public String[] getList() {
		return drinksList;
	}
	
	public double[] getListsPrice() {
		return drinkPrices;
	}
	
}
 