
import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
//	private char member;
	
	
//	public ShoppingCart(int customerAge , char member) {
	public ShoppingCart(int customerAge) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
//		this.member = member;
		System.out.println("Shopping Cart is created ... ");
	}
	
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}
	
	public int getCustomerAge() {
		return this.customerAge;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
		// YOUR CODE HERE
		if(product instanceof AgeRestrictedProduct) {
			AgeRestrictedProduct check = (AgeRestrictedProduct) product;
			if(check.isEligible(customerAge)) {
			products.add(product);
			System.out.println(product.getName() +" added to cart");
		}
		else {
			System.out.println("You are not eligible to purchase " + product.getName());
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
		System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20,'S');
		ShoppingCart cart2 = new ShoppingCart(20,'N');
		cart.addProduct(candy);
		cart.addProduct(wine);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
		cart.addProduct(candy);
		cart.addProduct(wine);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
	}

}
