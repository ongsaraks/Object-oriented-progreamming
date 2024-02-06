
public class MalaHotpotBillingV2 {

	public static void main(String[] args) {
		

		   int TotalCost = 0;
	   	   int numcus = 3;
	       String EntryTime = "1230";
	       String ExitTime = "1531";
	       int EntryTimeN = Integer.parseInt(EntryTime);
	       int ExitTimeN = Integer.parseInt(ExitTime);
	       System.out.println("No.customer: " + numcus);
	       System.out.println("Entry time -> " + EntryTimeN);
	       System.out.println("Exit time -> " + ExitTimeN);
	       int EntryHour = EntryTimeN / 100;
	       int EntryMin = EntryTimeN % 100;
	       int ExitHour = ExitTimeN / 100;
	       int ExitMin = ExitTimeN % 100;
	       int SumHour = ExitHour - EntryHour;
	       int SumMin = ExitMin - EntryMin;
	    
	       if(SumMin < 0) {
	    	   SumMin *= -1;
	       }
	       if(ExitMin < EntryMin) {
	    	   SumHour -=1;
	       }
	       String Duration = ((SumHour) + " hours and " +(SumMin) + " minutes");
	       System.out.println("Duration of Stay : "+ Duration);
   
	       	
	       		if((SumHour <= 2 && SumMin == 0) || (SumHour == 1 && SumMin >= 0)) {
	       			TotalCost += 299;
	       		
	       		}
	       		else if(SumHour >= 2 && SumMin >= 0) {
	       			TotalCost += ((100*(SumHour - 2)) + 299 );
	       			if(SumMin > 0) {
	       				TotalCost += 100;
	       			}
	       		
	       		}
	       		
	       	
	       	System.out.println("Total cost: " + TotalCost*numcus +" Baht");
	    	   
	    	   int star = SumHour * 60 / SumHour; 
	       for(int i = 1; i <= SumHour; i++) {
	    	   for(int j = 0; j < star; j++) {
	    		   if(j % 15 == 0) {
	    			   System.out.print("|");
	    		   }
	    		   System.out.print("*");
	    		   if(j  == 59) {
	    			   System.out.print(" "+ i + " hr");
	    		   }
	    		   
	    	   }
	    	   System.out.println("");
	     
	       }
	       if(SumMin > 0) {
	    	   
	    	   for(int i = 0; i < star; i++) {
	    		   if( i % 15 == 0) {
	    			   System.out.print("|");	 
	    		   }
	    		   if(i < SumMin) {
	    			   System.out.print("*");
	    		   }
    			   else{
    				   System.out.print(" ");		  
    			   }
	    		   if(i == 59) {
	    			   System.out.print(" "+ SumMin  + " min");
	    		   }
		    	    
	    	   }
	    	  
	    	  
		    	   System.out.println("");
		     
	       }
	       
	       
   }
}

//File: MalaHotpotBillingV2 Challenge
//Description: Calculate price of mala based on eat hour then print out the minute their take as a star
//Assignment Number: Lab02 Challenge
//
//ID: 6688093
//Name: Ongsa Raksalam
//Section: 2
//Grader: ICE
//
//On my honor, Ongsa Raksalam, this lab assignment is my own work
//and I have not provided this code to any other students.



	


