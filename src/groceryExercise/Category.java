package groceryExercise;
import util.Input;

import java.util.ArrayList;

public class Category {
    protected ArrayList<String> categories;
    protected String categoryName;

    public Category(String name) {
        this.categories = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addCategory(String category) {
        categories.add(category);
    }


}

//END GOAL: A BUNCH OF OBJECTS THAT DISPLAY THE NAME OF OBJECT AND THE QUANTITY
//



