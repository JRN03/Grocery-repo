
public class main {

	public static void main(String[] args) {
		UserInput ui = new UserInput();
		Cart c = new Cart();
		Items i;
		boolean shop = true;
		do {
	      String listType = ui.getLists();
          if(listType.equalsIgnoreCase("food")) 
          	  i = new Food(0);
          else if(listType.equalsIgnoreCase("drinks"))
             i = new Drinks(0);
          else 
        	  break;
        
          i.printList();
          
          String requested = ui.getItem(i.getList());
        
          switch(requested.toLowerCase()) {
            case "cookies": 
                String cookieSize = ui.getSize();
     	        if(cookieSize.equalsIgnoreCase("24 pack")) 
                   new Cookies(11).printInfo(requested);
        	    else
                   new Cookies(8).printInfo(requested);
                break;
            case "pizza": 
        	     new Pizza().printInfo(requested);
                 break;
            case "chips": 
               	 new Chips().printInfo(requested);
                 break;  
            case "salsa":
        	     new Salsa().printInfo(requested);
        	     break;
            case "mountain dew": 
        	     String mdSize = ui.getSize();
        	     if(mdSize.equalsIgnoreCase("24 pack"))
        		    new MountainDew(14).printInfo(requested);
        	     else
        	        new MountainDew(11).printInfo(requested);
                 break;
            case "water":
        	      String waterSize = ui.getSize();
        	      if(waterSize.equalsIgnoreCase("24 pack"))
        		    new Water(10).printInfo(requested);
        	      else
        	        new Water(6).printInfo(requested);
        	      break; 
            case "tea": 
        	      new Tea().printInfo(requested);;
        	      break;
            case "cerveza":
        	      new Cerveza().printInfo(requested);
          	      break;
            case "pepsi":
                  new Pepsi().printInfo(requested);
                  break;  
          }//switch
          if(ui.verify() == true)
             c.addCart(requested, i.getCost());
          System.out.println("In Cart");
          c.printCart();
          System.out.printf("Total: $%.2f",  c.getTotal());
          System.out.println();
	  }//do while
	  while(shop);
		
	  System.out.println("Pay up punk!");
	}//method

}//main
