public class StarbuzzCoffee {
    public static void main(String args[]) {
        /*
        Open an espresso, no condiments and print its desc and cost
        */
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $"+beverage.cost());

        Beverage beverage2 = new DarkRoast(); // Make a Dark Roast object
        beverage2 = new Mocha(beverage2); // wrap it with Mocha
        beverage2 = new Mocha(beverage2); // second Mocha
        beverage2 = new Whip(beverage2); // Wrap it in a while

        System.out.println(beverage2.getDescription() + " $"+beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $"+beverage3.cost());


    }
}