package CoffeeShop;

public class Espresso extends Coffee {

    private String milkType;

    public Espresso(String name, String milkType) {
        super(name);
        this.milkType = milkType;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing espresso drink: " + getName());
        System.out.println("Milk: " + milkType);
    }
    @Override
    public String toString() {
        return getName() + ", " + getMilkType();
    }
    //getters & setters
	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
    //^
	
}
