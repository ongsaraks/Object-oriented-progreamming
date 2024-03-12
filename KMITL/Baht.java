import java.util.Scanner;
public class Baht extends Currency{
	public Baht(double price, int typeOut) {
		super(price,typeOut);
		// TODO Auto-generated constructor stub
	}

	public void TakeMoney() {
	    if(super.typeOut==1) {
	    	price /= 35.90;
	        System.out.printf("Your Money is $%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    else if(super.typeOut==2) {
	    	price /= 0.027;
	        System.out.printf("Your Money is ₩%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    else if(super.typeOut==3) {
	    	price /= 0.24;
	        System.out.printf("Your Money is ¥%.3f\n",price);
	        System.out.print("---Thank you---");
	    }
	    }
	}
