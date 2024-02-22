// File: <Member>
// Description: <inheretance class from Product>
// Assignment Number: <Lab 6 challenge>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: 
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.
public class MemberRestrictProduct extends Product {
	private char haveM;
	public MemberRestrictProduct(String name,double price,char haveM) {
		super(name,price);
		this.haveM = haveM;
		System.out.println("haveM is created...");
	}
	public void setMember(char M) {
		this.haveM = M;
	}
	public char getMember() {
		return this.haveM;
	}
	public boolean isMember(char M) {
		if(M == 'M'){
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return super.toString() + this.haveM;
	}
	
	 
	
}
