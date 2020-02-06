package myepamproject;

public class Sweets extends Chocolate{
	  int price;
	  int quantity;
	  String name;
	  Sweets()
	  {
		  
	  }
	  Sweets(String name,int quantity,int price)
	  {
		  this.name=name;
		  this.price=price;
		  this.quantity=quantity;
	  }
	    int weight(Sweets sweets[])
	  {
		  int wt=0;
		  for(int i=0;i<sweets.length;i++)
		  {
			  wt+=sweets[i].price;
		  }
		  return wt;
	  }
	}
