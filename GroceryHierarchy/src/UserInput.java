import java.util.Scanner;
public class UserInput {
	
   private Scanner kb; 
   static String type;
   
   public UserInput() {
	   kb = new Scanner(System.in);
   }
   
   public String getLists() {
	   System.out.println("Food or Drinks? Type EXIT to Stop shopping");
	   type = kb.nextLine();
	   if(!new CheckInputs(type).checkList())
		   getLists();
	   return type;
   }
   
   public String getItem(String[] itemList) {
	   System.out.println("What item would you like to add?");
	   String response = kb.nextLine();
	   if(!new CheckInputs(response).checkItem(itemList))
		   getItem(itemList);
	   return response;
   }
   
   public boolean verify() {
	   System.out.println("\nAdd item?");
	   String response = kb.nextLine();
	   if(!new CheckInputs(response).checkYesorNo())
		   verify();
	   if(response.equalsIgnoreCase("yes"))
	     return true;
	   else 
		 return false;
   }
   
   public String getSize() {
	   System.out.println("What size would you like? (24 pack or 12 pack)");
	   String response = kb.nextLine();
	   if(!new CheckInputs(response).checkSize())
		   getSize();
	   return response;
   }
}
