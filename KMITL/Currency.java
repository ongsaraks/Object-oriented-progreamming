import java.util.Scanner;

public class Currency {
	public void TakeMoney() {
        double point;
        Scanner kbd = new Scanner(System.in);
        String Currency[] = new String[3];
        System.out.printf("---Choice Currency?---\n1.%s\n2.%s\n3.%s\n",Currency[0],Currency[1],Currency[2]);
        System.out.printf("\nSelect Currency :");
        int n = kbd.nextInt();
        if (n>3) { 
            System.out.printf("---Sorry something went wrong---");
         }
        else{ 
        System.out.printf("---Do you want to change USD to %s---\n ",Currency[n-1]);
        System.out.print("Please Enter your Money: ");
        double money = kbd.nextInt();
        if(n==1) {
            point = money/0.028;
            System.out.printf("Your Money is ฿%.2f\n",point);
            System.out.print("---Thank you---");
        }
        else if(n==2) {
            point = money/0.00075;
            System.out.printf("Your Money is ₩%.2f\n",point);
            System.out.print("---Thank you---");
        }
        else if(n==3) {
            point = money/0.0066;
            System.out.printf("Your Money is ¥%.2f\n",point);
            System.out.print("---Thank you---");
        }
     
        }
    }
}
