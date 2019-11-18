package Restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private String name;
    private Date lastUpdated;


    public Menu(String name){
        this.name = name;
        this.lastUpdated = new Date();

    }

    public String getName() {
        return name;
    }


    public ArrayList<MenuItem> getMenuItems(){
        return  items;
    }

    public void addItem(MenuItem aItem) {
        if (this.getMenuItems().contains(aItem)) {
            System.out.println("WARNING Menu:" + this.name +" already has the item " + aItem.getName() +".\n");
        } else {
            items.add(aItem);
            this.lastUpdated = new Date();
        }
    }


    public void removeItem(MenuItem aItem){
        this.items.remove(aItem);
        this.lastUpdated = new Date();

    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

//    public void printMenu(ArrayList<String> MenuItems) {
//        for (String item: MenuItems) {
//            System.out.println(item);
//        }
//    }


    @Override
    public String toString() {
       String itemList = "";
        for (MenuItem item: items) {
            itemList += item + "\n\n";
        };
        return  this.name + "\n\n" + itemList + "\nLast updated: " + this.lastUpdated;
    }
}
