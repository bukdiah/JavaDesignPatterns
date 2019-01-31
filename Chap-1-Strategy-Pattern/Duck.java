public abstract class Duck {
  /*
  Declare 2 reference variables for the behavior interface
  types. All duck subclasses (in the same package) inherit these
  */
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {

  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly(); // Delegate to the behavior class
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
}