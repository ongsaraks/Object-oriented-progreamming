import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    String Currency[] = {"THB","USD","WON","JPY"};
    Baht money1 = new Baht();
    Dollars money2 = new Dollars();
    Won money3 = new Won();
    Yen money4 = new Yen();
    Scanner kbd = new Scanner(System.in);
    System.out.println("What type of currency is your money?");
    System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n",Currency[0],Currency[1],Currency[2],Currency[3]);
    System.out.print("Currency is:");
    int type = kbd.nextInt();
    if(type == 1) {
    	Baht.TakeMoney();
    }
    else if(type == 2) {
        Dollars.TakeMoney();
    }
    else if(type == 3) {
        Won.TakeMoney();
    }
    else if(type == 4) {
        Yen.TakeMoney();
    }
    else  {
        System.out.print("---Sorry something went wrong---");
    }
}
}