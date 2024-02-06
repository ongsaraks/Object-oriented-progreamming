public class HomeBuilder {

  public static void main(String[] args) {

    int i, j,k;
    System.out.println("STEP 1:");
    for (i = 0; i < 12; i++) {
      System.out.print("=");
    }
    System.out.println("");
    System.out.println("STEP 2:");
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 12; j++) {
        if (j < 2 || j > 9) {
          System.out.print("|");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println("");
    }

    for (i = 0; i < 12; i++) {
      System.out.print("=");
    }
    System.out.println("");

    System.out.println("STEP 3:");

    for (i = 6; i > 0; i--) {
      for (j = 0; j < i-1; j++) {
        System.out.print(" ");
      }

      System.out.print("/");
      	if(i > 0) {
      		for(k = 6; k > i;k--) {
      			System.out.print("++");
      		}
      		System.out.print("\\");
      		
      		
      	}
      
      System.out.println();
    }
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 12; j++) {
          if (j < 2 || j > 9) {
            System.out.print("|");
          } else {
            System.out.print(" ");
          }

        }
        System.out.println("");
      }
    for (i = 0; i < 12; i++) {
        System.out.print("=");
      }
      System.out.println("");

  }
}

//File: HomeBuilder
//Description: build a house by using loop
//Assignment Number: Challenge Bonus 1
//
//ID: 6688093
//Name: Ongsa Raksalam
//Section: 2
//Grader: Sorn
//
//On my honor, Ongsa Raksalam, this lab assignment is my own work
//and I have not provided this code to any other students.
