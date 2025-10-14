package CoffeeShop;

public class RegularCustomer extends Customer {

	public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void payCoffee() {
        System.out.println("Regular customer can pay for the coffee using credit card or cash.");
    }
	
	
}
