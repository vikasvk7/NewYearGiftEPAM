package myepamproject;

public class Chocolate{
	  String name ;
	  int price;
	  Chocolate()
	  {
		  //default
	  }
	  Chocolate(String name,int price)
	  {
		  this.name=name;
		  this.price=price;
	  }
	   int weight(Chocolate chocolates[])
	  {
		  int wt=0;
		  int n = chocolates.length;
		  for(int i=0;i<n;i++)
		  {
			  wt+=(chocolates[i].price);
		  }
		  return wt;
	  }
	}