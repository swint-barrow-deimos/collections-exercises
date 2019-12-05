package groceryExercise;
import util.Input;

public class GroceryListApplication {

    public static void main(String[] args) {
        String userInput;

        System.out.println("Would you like to create a grocery list?");
        Input input = new Input();
        userInput = input.toString();
        if (userInput.equalsIgnoreCase("yes")) {
            do {
                System.out.println("Please choose a category: ");
                input = new Input();
                userInput = input.toString();


            } while (true);
        } else {
            System.out.println("Thank you for shopping.");
        }
    }
}
