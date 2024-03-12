import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int typeIn,typeOut;
    String Currency[] = {"THB","USD","WON","JPY"};
	Scanner kbd = new Scanner(System.in);
	System.out.print("How much do you want to exchange: ");
	double price = kbd.nextDouble();
	
	
	System.out.print("What type of currency is your money: ");
	System.out.printf("\n1.%s\n2.%s\n3.%s\n4.%s\n",Currency[0],Currency[1],Currency[2],Currency[3]);
	System.out.print("Currency is:");
	typeIn = kbd.nextInt();
	while(!(typeIn >= 1 && typeIn <= 4)) {
		System.out.print("What type of currency is your money: ");
		System.out.printf("\n1.%s\n2.%s\n3.%s\n4.%s\n",Currency[0],Currency[1],Currency[2],Currency[3]);
		System.out.print("Currency is:");
		typeIn = kbd.nextInt();
	}
	
	
    System.out.println("What type of currency you want to change to");
    System.out.printf("\n1.%s\n2.%s\n3.%s\n4.%s\n",Currency[0],Currency[1],Currency[2],Currency[3]);
	System.out.print("Currency is:");
    typeOut = kbd.nextInt();
    while(!(typeOut >= 1 && typeOut <= 4)) {
		System.out.print("---Sorry something went wrong---\n");
		System.out.print("What type of currency is your money: ");
		System.out.printf("\n1.%s\n2.%s\n3.%s\n4.%s\n",Currency[0],Currency[1],Currency[2],Currency[3]);
		System.out.print("Currency is:");
		typeOut = kbd.nextInt();
	}
    Currency[] Money = new Currency[4];
    Money[0] = new Baht(price,typeOut);
    Money[1] = new Dollars(price,typeOut);
    Money[2]= new Won(price,typeOut);
    Money[3] = new Yen(price,typeOut);
    	
    Money[typeIn-1].TakeMoney();
}
	
}