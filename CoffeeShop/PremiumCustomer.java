package CoffeeShop;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void payCoffee() {
        System.out.println("Premium customer can pay using bitcoin, credit card, or cash. A 10% discount will be applied.");   
    }
    
        
    
}