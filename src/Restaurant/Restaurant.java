package Restaurant;

public class Restaurant {
        public static void main(String[] args) {

            // time last menu item added
            // print single menu item w/ get item?
            // equals method for items
            MenuItem pizza = new MenuItem("Cheese Pizza", 11.00, "There's cheese, bread, and sauce.  What more can I tell you?", "Dinner");
            MenuItem burger = new MenuItem("Burger", 12.40, "A brioche bun, swiss cheese with the patty resting on a bed of lettuce", "Dinner");
            MenuItem fries = new MenuItem("Sweet tater fries", 2.22, "crunchy orange blocks", "Side");
            MenuItem iceCream = new MenuItem("Vanilla Ice-Ice Cream", 4.15, "A cold sweet milk product", "Dessert");

            Menu pizzaPlace = new Menu("PIZZA PLACE");
            pizzaPlace.addItem(pizza);
            pizzaPlace.addItem(burger);
            pizzaPlace.addItem(burger);
            pizzaPlace.addItem(fries);
            pizzaPlace.addItem(iceCream);


            System.out.println(pizzaPlace);
            System.out.println("Print individual item\n" + pizza + "\n");
            pizzaPlace.removeItem(burger);
            System.out.println(pizzaPlace);

        }
    }

