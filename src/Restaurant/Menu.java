package Restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void addItem(MenuItem aItem) {
        items.add(aItem);
    }

    public ArrayList<String> getItems() {
        ArrayList<String> itemThing = new ArrayList<>();

        for (MenuItem item : this.items) {
            String ItemBlock = "";
            ItemBlock += item.getName() + "- ";
            ItemBlock += item.getPrice() + "\n";
            ItemBlock += item.getDescription() + "\n";
            itemThing.add(ItemBlock);
        }
        return itemThing;
    }

    public void printMenu(ArrayList<String> MenuItems) {
        for (String item: MenuItems) {
            System.out.println(item);
        }
    }

    public Menu(String name){
        this.name = name;

    }
}
