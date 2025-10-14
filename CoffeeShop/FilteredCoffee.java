package CoffeeShop;

public class FilteredCoffee extends Coffee {
	
	private String brewType;
	
	public FilteredCoffee(String name, String brewType) {
		super(name);
		this.brewType = brewType;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing filtered coffee: " + getName());
		System.out.println("Brew type: " + brewType);
	}
	@Override
	public String toString() {
	    return getName() + ", " + getBrewType();
	}
	//getter & setter
	public String getBrewType() {
		return brewType;
	}

	public void setBrewType(String brewType) {
		this.brewType = brewType;
	}
	//^
	
	
}
