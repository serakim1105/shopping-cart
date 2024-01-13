import java.util.Scanner;

public class ShoppingCartManager {

	public static void main(String[] args) {
		

	//set up scanner
		Scanner scnr = new Scanner(System.in);
	
	//prompt user for customer's name and date
		System.out.println("Enter Customer's Name:");
		String customerName = scnr.nextLine();
		
		System.out.println("Enter Today's Date:");
		String date = scnr.nextLine();
		
		System.out.println();
		
	//output the name and date
		System.out.println("Customer Name: " + customerName);
		System.out.println("Today's Date: " + date);
		
		System.out.println();
		
	//create an object of type ShoppingCart
		ShoppingCart newCart = new ShoppingCart(customerName, date);
		
	//implement printMenu() method 
		char userInput = 0; 
		
		while   (userInput != 'q') {
			if ((userInput == 'a') || (userInput == 'd') ||
				(userInput == 'c') || (userInput == 'i') ||
				(userInput == 'o') || (userInput == 0))
				{
				newCart.printMenu();
				}
			System.out.println("Choose an option:");
			String example = scnr.nextLine();
			userInput = example.charAt(0);
			
	//implement Output shopping cart menu option
		if (userInput == 'o') {
			System.out.println("OUTPUT SHOPPING CART");
			newCart.printTotal();
		}
	
	//implement print description option
		if (userInput == 'i') {
			System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
			newCart.printDescriptions();
		}
		
	//implement add item option	
		if (userInput == 'a') {
			System.out.println("ADD ITEM TO CART");
			
			System.out.println("Enter the item name:");
			String itemName = scnr.nextLine();
			
			System.out.println("Enter the item description:");
			String itemDescription = scnr.nextLine();
			
			System.out.println("Enter the item price:");
			int itemPrice = scnr.nextInt();
			scnr.nextLine();
			
			System.out.println("Enter the item quantity:");
			int itemQuantity = scnr.nextInt();
			scnr.nextLine();
			
			ItemToPurchase item1 = new ItemToPurchase(itemName, 
								itemDescription, itemPrice, itemQuantity);
			newCart.addItem(item1);
			System.out.println();
		}
	
	//implement remove item option
		if (userInput == 'd') {
			System.out.println("\nREMOVE ITEM FROM CART");
			System.out.println("Enter name of item to remove:");
			String item2 = scnr.nextLine();
			
			newCart.removeItem(item2);
		}
	
	//implement change quantity option
		if (userInput == 'c') {
			System.out.println("CHANGE ITEM QUANTITY");
			System.out.println("Enter the item name:");
			String item3 = scnr.nextLine();
			
			System.out.println("Enter the new quantity:");
			int newQuantity = scnr.nextInt();
			scnr.nextLine();
			
			newCart.modifyItem(item3, newQuantity);
		}
		}
	}
}
