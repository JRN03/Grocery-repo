
public class CheckInputs {
   private String input;
   
   public CheckInputs(String input) {
	   this.input = input;
   }
   
   public boolean checkYesorNo() {
	   if(!input.equalsIgnoreCase("Yes") && !input.equalsIgnoreCase("NO"))
	      return false;
	   return true;
   }
   
   public boolean checkItem(String[] itemList) {
	   for(String x:itemList) {
		   if(x.equalsIgnoreCase(input))
			   return true;
	   }
	   return false;
   }
   
   public boolean checkList() {
	   if(!input.equalsIgnoreCase("food") && !input.equalsIgnoreCase("drinks") && !input.equalsIgnoreCase("Exit"))
		   return false;
	   return true;
   }
   
   public boolean checkSize() {
	   if(!input.equalsIgnoreCase("24 pack") && !input.equalsIgnoreCase("12 pack"))
		   return false;
	   return true;
   }
}
