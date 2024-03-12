import java.util.Scanner;
public class Dollars extends Currency{
	protected double Dollars = 35.90; // Baht to Dollars
	protected double Won = 0.027; // Baht to Dollars
	protected double Yen = 0.24; // Baht to Dollars
	public Dollars(double price, int typeOut) {
		super(price, typeOut);
		// TODO Auto-generated constructor stub
	}
	public void TakeMoney() {
	    if(super.typeOut==1) {
	    	price /= Dollars;
	        System.out.printf("Your Money is $%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    else if(super.typeOut==2) {
	    	price /= Won;
	        System.out.printf("Your Money is ₩%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    else if(super.typeOut==3) {
	    	price /= Yen;
	        System.out.printf("Your Money is ¥%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    }

    
    }
