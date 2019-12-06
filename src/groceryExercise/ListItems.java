package groceryExercise;
import util.Input;

import java.util.ArrayList;

public class ListItems implements Comparable<ListItems>{
    private String itemName;
    private String categoryName;
    private int amount;


    public ListItems(String name, String category, int quantity) {
            this.itemName = name;
            this.categoryName = category;
            this.amount = quantity;
    }

    public String getName() {
        return itemName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int compareTo(ListItems o) {
        int compare = itemName.compareTo(o.itemName);
        return compare;
    }
}

//END GOAL: A BUNCH OF OBJECTS THAT DISPLAY THE NAME OF OBJECT AND THE QUANTITY
//



