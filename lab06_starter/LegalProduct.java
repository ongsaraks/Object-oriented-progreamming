// File: <Legal>
// Description: <inheretance class from Product>
// Assignment Number: <Lab 6 challenge>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: ICE
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
public class LegalProduct extends Product{
	String legal;
	public LegalProduct(String name, double price, String Legal){
		super(name,price);
		this.legal = Legal;
		System.out.println("Legal product is created ...");
	}
	public void setLegal(String Legal) {
		this.legal = Legal;
	}
	public String getLegal() {
		return this.legal;
	}
	public boolean isLegal(String Legal) {
		if(Legal == "Yes") {
			return true;
		}
		return false;
	}
}
