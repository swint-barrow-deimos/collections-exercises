package groceryExercise;
import util.Input;
import java.util.HashMap;

public class GroceryListApplication {

    public static void main(String[] args) {
        String userInput1;
        int userInput2;

        Category choice = new Category("choice");
        choice.addCategory("Veggies");
        choice.addCategory("Meat");
        choice.addCategory("Bread");
        choice.addCategory("Frozen");


        HashMap<String, Integer> veggieItems = new HashMap<>();
        HashMap<String, Integer> meatItems = new HashMap<>();
        HashMap<String, Integer> breadItems = new HashMap<>();
        HashMap<String, Integer> frozenItems = new HashMap<>();




        System.out.println("Would you like to create a grocery list?");
        Input input = new Input();
        userInput1 = input.toString();
//        if (userInput1.equalsIgnoreCase("yes")) {
//            do {
                System.out.println("Please choose a category: ");
                System.out.println(choice.categories.toString());
                input = new Input();
                userInput1 = input.getString();
                System.out.println(userInput1);


//            } while (true);
//        } else {
//            System.out.println("Thank you for shopping.");
//        }
    }
}
