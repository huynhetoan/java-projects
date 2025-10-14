package CoffeeShop;

public abstract class Customer {
	
	private String name;

    public Customer(String name) {
        this.name = name;
    }

    //getters & setters
    public abstract void payCoffee();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    //^
	
	
	

}
