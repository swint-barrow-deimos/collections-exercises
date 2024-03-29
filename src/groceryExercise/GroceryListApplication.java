package groceryExercise;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;


public class GroceryListApplication {

    public static void main(String[] args) {
        String userInput;
        String categoryInput;
        String itemInput;
        String exitShopping;
        int quantityInput;
        ArrayList<ListItems> listOfItems = new ArrayList<>();

        System.out.println("Do you want to make a list? [y/n]");
        Input input = new Input();
        userInput = input.getString();
        do {
            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Please choose a category...\n" +
                        "Veggies\n" +
                        "Meat\n" +
                        "Dairy\n" +
                        "Frozen\n" +
                        "Other");
                input = new Input();
                categoryInput = input.getString().toLowerCase();
//                if (!categoryInput.equalsIgnoreCase("veggies")) {
//                    System.out.println("That category doesn't exist, please try again...");
//                    continue;
//                } else if (!categoryInput.equalsIgnoreCase("meat")) {
//                    System.out.println("That category doesn't exist, please try again...");
//                    continue;
//                } else if (!categoryInput.equalsIgnoreCase("dairy")) {
//                    System.out.println("That category doesn't exist, please try again...");
//                    continue;
//                } else if (!categoryInput.equalsIgnoreCase("frozen") {
//                    System.out.println("That category doesn't exist, please try again...");
//                    continue;
//                } else if (!categoryInput.equalsIgnoreCase("other")) {
//                    System.out.println("That category doesn't exist, please try again...");
//                    continue;
//                }
                System.out.println("Please enter a food item for this category...");
                input = new Input();
                itemInput = input.getString().toLowerCase();
                System.out.println("Please enter quantity desired...");
                input = new Input();
                quantityInput = input.getInt();

                ListItems item = new ListItems(itemInput, categoryInput, quantityInput);
                listOfItems.add(item);

                System.out.println("Would you like to see your shopping card? [y/n]");
                input = new Input();
                exitShopping = input.getString().toLowerCase();

                if (exitShopping.equalsIgnoreCase("y"))
                    for (ListItems itemOnList : listOfItems) {
                        System.out.printf("Category: %s | Item: %s | Quantity: %s %n", itemOnList.getCategoryName(), itemOnList.getName(), itemOnList.getAmount());
                    }

                System.out.println("Would you like to add another item? [y/n]");
                input = new Input();
                userInput = input.getString();

            } else {
                System.out.println("Thanks");
            }
        } while (!userInput.equalsIgnoreCase("n"));
        System.out.println("Thanks");
        Collections.sort(listOfItems);

        for (ListItems item : listOfItems) {
            if (item.getCategoryName().equalsIgnoreCase("veggies")) {
                System.out.printf("Category: %s | Item: %s | Quantity: %s %n", item.getCategoryName(), item.getName(), item.getAmount());
            }
        }

        for (ListItems item : listOfItems) {
            if (item.getCategoryName().equalsIgnoreCase("meat")) {
                System.out.printf("Category: %s | Item: %s | Quantity: %s %n", item.getCategoryName(), item.getName(), item.getAmount());            }
        }

        for (ListItems item : listOfItems) {
            if (item.getCategoryName().equalsIgnoreCase("Dairy")) {
                System.out.printf("Category: %s | Item: %s | Quantity: %s %n", item.getCategoryName(), item.getName(), item.getAmount());            }
        }
        for (ListItems item : listOfItems) {
            if (item.getCategoryName().equalsIgnoreCase("frozen")) {
                System.out.printf("Category: %s | Item: %s | Quantity: %s %n", item.getCategoryName(), item.getName(), item.getAmount());            }
        }
        for (ListItems item : listOfItems) {
            if (item.getCategoryName().equalsIgnoreCase("other")) {
                System.out.printf("Category: %s | Item: %s | Quantity: %s %n", item.getCategoryName(), item.getName(), item.getAmount());            }
        }



//        for (ListItems itemOnList : listOfItems) {
//            System.out.printf("Category: %s | Item: %s | Quantity: %s %n", itemOnList.getCategoryName(), itemOnList.getName(), itemOnList.getAmount());
//        }

    }

}
