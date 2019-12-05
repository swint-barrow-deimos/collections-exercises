package groceryExercise;
import util.Input;

import java.util.ArrayList;

public class ListItems {
    private String itemName;
    private String categoryName;
    private int amount;


    public ListItems(String category, String name, int quantity) {
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

}

//END GOAL: A BUNCH OF OBJECTS THAT DISPLAY THE NAME OF OBJECT AND THE QUANTITY
//



