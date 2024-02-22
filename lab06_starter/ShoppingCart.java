// File: <ShoppingCart>
// Description: <Add product to shoppingCart>
// Assignment Number: <Lab 6>
//
// ID: <6688093>
// Name: Ongsa Raksalam
// Section: 2
// Grader: 
//
// On my honor, Ongsa Raksalam, this lab assignment is my own work
// and I have not provided this code to any other students.

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
	private char member; // challenge
	private String legal; //challenge
	
	public ShoppingCart(int customerAge , char member,String Legal) { // challenge
//	public ShoppingCart(int customerAge) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
		this.member = member; // challenge
		this.legal = Legal; // challenge
		System.out.println("Shopping Cart is created ... ");
	}
	public void setLegal(String Legal) {
		this.legal = Legal;
	}
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}
	public void setMember(char member) {
		this.member = member;
	}
	
	public int getCustomerAge() {
		return this.customerAge;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
		// YOUR CODE HERE
		if(product instanceof AgeRestrictedProduct) {
			AgeRestrictedProduct check = (AgeRestrictedProduct) product;
			if(check.isEligible(getCustomerAge())) {
			products.add(product);
			System.out.println(product.getName() +" added to cart");
		}
		else {
			System.out.println("You are not eligible to purchase " + product.getName());
		}
		
		}
		else if(product instanceof MemberRestrictProduct) { // challenge
			MemberRestrictProduct checkM = (MemberRestrictProduct) product;
			if(checkM.isMember(checkM.getMember())) {
				products.add(product);
				System.out.println(product.getName() +" added to cart");
			}
			else {
				System.out.println("Only member are allowed");
			}
			
		} // challenge
		else if(product instanceof Legal) {
			Legal checkL = (Legal)product;
			if(checkL.isLegal(checkL.getLegal())) {
				products.add(product);
				System.out.println(product.getName() +" added to cart");
			}
			else {
				System.out.println(product.getName()  + " It's eligal Call the police!!!!!!!!");
			}
		}
		else {
			products.add(product);
			System.out.println(product.getName() + " added to cart");
		}

	}
	
	// TODO 6: calculate total price
	public double calculateTotalPrice() {
		// YOUR CODE HERE
		float sum = 0; 
		for(Product i : products) {
			sum += i.getPrice();
		}
//		#Draft
//		if(ShoppingCart.) {   
//			return (sum * 10)/100;
//		}
//		else {
//			return sum;
//		}    				
//		#Draft
		return sum;
	}

	public void clear() {
		products.clear();
		System.out.println("Shopping Cart is cleared ... ");
	}
	
	
	// DO NOT MODIFY MAIN
	public static void main(String[] args) {
		System.out.println("Creating Products");
		Product candy = new Product("Candy", 25.00);
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
//		Member Exclusive = new Member("Chocolate",20,'N');
//		Legal Yaba = new Legal("Yaba",3,"No");
//		Legal Medicine = new Legal("Para",15,"Yes");
//		Legal Guncha = new Legal("Guncha",15,"No");
		System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20,'N',"Not specific");
		cart.addProduct(candy);
		cart.addProduct(wine);
//		cart.addProduct(Exclusive); //challenge
//		cart.addProduct(Medicine); // challenge
//		cart.addProduct(Yaba); //challenge
//		cart.addProduct(Guncha); //challenge
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
//		cart.setMember('M');  //challenge
		cart.addProduct(candy);
		cart.addProduct(wine);
//		cart.addProduct(Exclusive); //challenge
//		cart.addProduct(Medicine); // challenge
//		cart.addProduct(Yaba); //challenge
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
	}

}
