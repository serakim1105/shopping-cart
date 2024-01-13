
public class ItemToPurchase {

	private String name;
	private String itemDescription = "pretty";
	private int price;
	private int quantity;
	
	//default constructor
	public ItemToPurchase() {
		this.itemDescription = "";
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	//overloaded constructor
	public ItemToPurchase(String n, String d, int p, int q) {
		this.name = n;
		this.itemDescription  = d;
		this.price = p;
		this.quantity = q;
	}
	
	//getter and setter methods
	public void setDescription(String d) {
		itemDescription = d;
	}
	
	public String getDescription() {
		return itemDescription;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void printItemCost() {
		System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + 
						  (getQuantity() * getPrice()));
	}
	
	public void printItemDescription() {
		System.out.println(getName() + ": " + getDescription());
	}
	
	
	
	
	
}







