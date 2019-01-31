/*
    Need to be interchangeable with a Beverage, so
    we extend the Beverage class to get same subtype
*/
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}