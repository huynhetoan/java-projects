package CoffeeShop;

public abstract class Coffee {

	private String name;
	
	public Coffee(String name) {
		this.name = name;

	}
	//polymorphic
	public abstract void prepare();
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//^
	
	
}
