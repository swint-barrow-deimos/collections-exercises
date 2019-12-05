package groceryExercise;
import util.Input;
import java.util.ArrayList;


public class GroceryListApplication {

    public static void main(String[] args) {
        String userInput;
        String categoryInput;
        String itemInput;
        int quantityInput;
        ArrayList<Object> listOfItems = new ArrayList<>();

        System.out.println("Do you want to make a list? [y/n]");
        Input input = new Input();
        userInput = input.getString();
        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Please choose a category...\n" +
                    "Veggies\n" +
                    "Meat\n" +
                    "Dairy\n" +
                    "Frozen");
            input = new Input();
            categoryInput = input.getString();
            System.out.println("Please enter a food item for this category...");
            input = new Input();
            itemInput = input.getString();
            System.out.println("Please enter quantity desired...");
            input = new Input();
            quantityInput = input.getInt();

            ListItems item1 = new ListItems(categoryInput, itemInput, quantityInput);

        } else {
            System.out.println("Thanks");
        }

    }
}
