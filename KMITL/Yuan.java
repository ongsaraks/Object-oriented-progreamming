import java.util.Scanner;
public class Yuan {
    public static void TakeMoney() {
        double point;
        Scanner kbd = new Scanner(System.in);
        String Currency[] = {"THB","USD","JPY","WON"};
        System.out.printf("---Choice Currency?---\n1.%s\n2.%s\n3.%s\n4.%s",Currency[0],
                Currency[1],Currency[2],Currency[3]);
        System.out.printf("\nSelect Currency :");
        int n = kbd.nextInt();
        if (n>4) { 
            System.out.println("---Sorry something went wrong---");
        }
        else{ 
            System.out.printf("---Do you want to change Yuan to %s---\n ",Currency[n-1]);
            System.out.print("Please Enter your Money: ");
        double money = kbd.nextInt();
        if(n==1) {
            point = money/0.20;
            System.out.printf("Your Money is ฿%.2f\n",point);
            System.out.print("---Thank you---");
        }
        else if(n==2) {
            point = money/7.20;
            System.out.printf("Your Money is $%.2f\n",point);
            System.out.print("---Thank you---");
        }
        else if(n==3) {
            point = money/0.048;
            System.out.printf("Your Money is ¥%.2f\n",point);
            System.out.print("---Thank you---");
        }
        else if(n==4) {
            point = money/0.0054 ;
            System.out.printf("Your Money is ¥%.2f\n",point);
            System.out.print("---Thank you---");
        }
       }
    }
   }