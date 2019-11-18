package Restaurant;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Currency;
import java.util.Objects;


public class MenuItem {

    private boolean isNew;
    private Double price;
    private String description;
    private String category;
    private String name;
    private Calendar timeCreated;


    public String getName(){
        return name;
    }




    public Double getPrice(){
        return price;
    }

    private void setPrice(Double aPrice){
        price = aPrice;
    }
    public String getDescription(){
        return description;
    }

    private void setDescription(String aDescription){
        description = aDescription;
    }
    private String getCategory(){
        return category;
    }

    private void setCategory(String aCategory){
        category = aCategory;
    }

    public MenuItem(String name, Double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.timeCreated = Calendar.getInstance();
        //this.isNew = getIsNew();
        this.isNew = true;
    }

//    public boolean getIsNew(){
//
//         Calendar comparisonDate = Calendar.getInstance();
//        if (this.timeCreated.after(comparisonDate) ) {
//            return true;
//
//        }
//        return false;
//    }


    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return this.category + "\n" + this.name + " - "+ this.price + "\n " + this.description ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category) &&
                Objects.equals(name, menuItem.name);
    }

}
