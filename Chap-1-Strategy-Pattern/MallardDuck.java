public class MallardDuck extends Duck {
  // Inherits the quackBehavior and flyBehavior instance variables
  // from class Duck
  public MallardDuck() {
    quackBehavior = new Quack(); // uses Quack class to handle its quack
    flyBehavior = new FlyWithWings(); // uses FlyWithWings as its FlyBehavior type
  }

  public void display() {
    System.out.println("I'm a real Mallard Duck!");
  }
}