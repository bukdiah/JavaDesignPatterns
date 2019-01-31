public class Mocha extends CondimentDecorator {
    // instance variable to hold the beverage we are wrapping
    Beverage beverage;
    /*
    A way to set this instance variable to the object we are
    wrapping
    */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    /*
    We want out desc to not only include the beverage - say
    Dark Roast - but also to have each item decorating the beverage, for
    instance, 'Dark Roast, Mocha.' So we first delegate to the object
    we are decorating to get its description, then appen ",Mocha" to
    that description
    */
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /*
    Compute the cost of our beverage with Mocha
    First, deleagte the call to the object we're decorating, so
    that it can compute the cost; then, we add the cost of Mocha to the
    result
    */
    public double cost() {
        return .20 + beverage.cost();
    }
}