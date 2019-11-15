package Restaurant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // write your code here
        Menu willMenu = new Menu("Willy's");
        System.out.println(willMenu.getName());
        willMenu.addItem(new MenuItem("burger", 7.77, "is food", "Main"));
        willMenu.addItem(new MenuItem("Salad", 5.12, "taste like leaves", "appetizer"));
       willMenu.printMenu(willMenu.getItems());
    }
}
