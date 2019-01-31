public class Soy extends CondimentDecorator {
    // instance variable to hold the beverage we are wrapping
    Beverage beverage;
    /*
    A way to set this instance variable to the object we are
    wrapping
    */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}