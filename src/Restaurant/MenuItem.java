package Restaurant;

import java.util.Currency;
import java.util.UUID;


public class MenuItem {

    // private final String id = UUID.randomUUID().toString();
    private Double price;
    private String description;
    private String category;
    private String name;

    public String getName(){
        return name;
    }

//    protected void SetName(String aName) {
////        name = aName;
////    }


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

    }




}
