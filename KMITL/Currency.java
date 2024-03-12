import java.util.Scanner;

abstract class Currency {
	  double price;
	  int typein;
	  int typeOut;
	 public Currency(double price,int typeOut) {
		 this.price = price;
		 this.typeOut = typeOut;
	 }
	public void TakeMoney() {
        if(this.typeOut==1) {
        	price /= 0.028;
            System.out.printf("Your Money is ฿%.2f\n",price);
            System.out.print("---Thank you---");
        }
        else if(this.typeOut==2) {
        	price /=0.00075;
            System.out.printf("Your Money is ₩%.2f\n",price);
            System.out.print("---Thank you---");
        }
        else if(this.typeOut==3) {
        	price /=0.0066;
            System.out.printf("Your Money is ¥%.2f\n",price);
            System.out.print("---Thank you---");
        }
     
        }
    }

