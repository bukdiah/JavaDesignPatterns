public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay(); // model duck begins grounded
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck!");
  }
}