public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    // subclasses need to implement this
    public abstract double cost();
}