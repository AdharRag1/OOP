import java.io.*; 
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Item Item1 = new Item();
        Item1.name="mocha";
        Item1.price=2000;
        Item Item2 = new Item();
        Item2.name="latte";
        Item2.price=2400;
        Item Item3 = new Item();
        Item3.name="drip coffee";
        Item3.price=2800;
        Item Item4 = new Item();
        Item4.name="cappuccino";
        Item4.price=2800;


        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";

        order2.items.add(Item1);
        order3.items.add(Item4);
        order4.items.add(Item2);
        order1.ready= true;

        order4.items.add(Item2);
        order4.items.add(Item2);

        order2.ready= true;


        

        System.out.printf("Name: %s\n", Item1.name);
        System.out.printf("Total: %s\n", Item1.total);
        System.out.printf("Ready: %s\n", Item1.ready);
    }
}