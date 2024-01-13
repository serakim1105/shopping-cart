import java.util.ArrayList;

public class ShoppingCart {

	private String customerName;
	private String currentDate;
	ArrayList <ItemToPurchase> cartItems;
	
	//default constructor
	public ShoppingCart() {
		this.customerName = "none";
		this.currentDate = "January 1, 2016";
		this.cartItems = new ArrayList<ItemToPurchase>();
	}
	
	//overloaded constructor
	public ShoppingCart(String customerName, String customerDate) {
		this();
		this.customerName = customerName;
		this.currentDate = customerDate;
	}
	
	//printMenu() method
	public void printMenu() {
		System.out.println("MENU");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Output items' descriptions");
		System.out.println("o - Output shopping cart");
		System.out.println("q - Quit");
		System.out.println();
	}
	
	//getter and setter methods
	public String getCustomerName() {
		return customerName;
	}

	public String getDate() {
		return currentDate;
	}

	public void addItem(ItemToPurchase item) {
		cartItems.add(item);
	}

	public void removeItem(String itemName) {
		for (ItemToPurchase item : cartItems) {
			if (item.getName().equals(itemName)) {
				cartItems.remove(item);
				System.out.println();
				return;
			}
		}
		System.out.println("Item not found in cart. Nothing removed.\n");
	}

	public void modifyItem(String itemName, int newQuantity) {
		//loop through each item to see if it matches the string input
		//if so, modify item in cart
		//if it doesn't, print the error message
		
		for (ItemToPurchase item : cartItems) {
			if (item.getName().equals(itemName)) {
				item.setQuantity(newQuantity);
				return;
			}
		}
		System.out.println("Item not found in cart. Nothing modified.\n");
	}
	
	public int getNumItemsInCart() {
		int totalItems = 0;
		for (ItemToPurchase item : cartItems) {
			totalItems += item.getQuantity();
		}
		return totalItems;
	}
	
	public int getCostOfCart() {
		int eachPrice;
		int totalPrice = 0;
		for (ItemToPurchase item : cartItems) {
			eachPrice = (item.getQuantity() * item.getPrice());
			totalPrice += eachPrice;
		}
		return totalPrice;
	}
	
	public void printTotal() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items: " + getNumItemsInCart());
		System.out.println();
		
		for (ItemToPurchase item : cartItems) {
			item.printItemCost();
		}
		
		if (cartItems.isEmpty()) {
			System.out.println("SHOPPING CART IS EMPTY");
		}
		
		System.out.println();
		System.out.println("Total: $" + getCostOfCart() + "\n");
	}
	
	public void printDescriptions() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("\nItem Descriptions");
		
		for (ItemToPurchase item : cartItems) {
			item.printItemDescription();
		}
		System.out.println();
		
	}

}
