public class Whip extends CondimentDecorator {
    // instance variable to hold the beverage we are wrapping
    Beverage beverage;
    /*
    A way to set this instance variable to the object we are
    wrapping
    */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}