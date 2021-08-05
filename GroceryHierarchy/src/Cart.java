import java.util.ArrayList;

public class Cart {
	
  private ArrayList<String> cart = new ArrayList<String> ();
  private double total;
  
  public void addCart(String item, double cost) {
	  cart.add(item);
	  total += cost;
  }
  
  public void printCart(){
	  for(String x:cart) 
		  System.out.println(x);
	  }
  
  public double getTotal() {
	  return total;
  }
  
}
