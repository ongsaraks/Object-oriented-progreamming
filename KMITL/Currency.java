import java.util.Scanner;

abstract class Currency {
	  double price;
	  int typein;
	  int typeOut;
	 public Currency(double price,int typeOut) {
		 this.price = price;
		 this.typeOut = typeOut;
	 }
	abstract void TakeMoney();
    }

