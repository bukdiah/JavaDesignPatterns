public class Espresso extends Beverage {
    public Espresso() {
        // inherited from Beverage
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}