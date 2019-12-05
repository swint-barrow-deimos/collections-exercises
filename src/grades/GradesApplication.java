package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {

    public static void main (String[] args) {

        String userInput;

        HashMap<String, Student> usernames = new HashMap<>();

        Student student1 = new Student("Andrew");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(95);

        Student student2 = new Student("Jacob");
        student2.addGrade(93);
        student2.addGrade(87);
        student2.addGrade(98);

        Student student3 = new Student("Chris");
        student3.addGrade(100);
        student3.addGrade(80);
        student3.addGrade(85);

        Student student4 = new Student("Bryan");
        student4.addGrade(95);
        student4.addGrade(92);
        student4.addGrade(97);

        usernames.put("dasher", student1);
        usernames.put("dancer", student2);
        usernames.put("prancer", student3);
        usernames.put("vixen", student4);

        System.out.println("Here are the GitHub usernames of our students: " + usernames.keySet());


        do {
            System.out.println("What student would you like to see more information on?");
            Input input = new Input();
            userInput = input.getString().toLowerCase();

            if (usernames.get(userInput) != null) {
                System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %.1f%n", usernames.get(userInput).getStudentName(), userInput, usernames.get(userInput).getGradeAverage());
                System.out.println("Would you like to see another student? [y/n]\n");
                input = new Input();
                userInput = input.getString();
            } else if (usernames.get(userInput) == null) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userInput);
                System.out.println("Would you like to see another student? [y/n]\n");
                input = new Input();
                userInput = input.getString();
            }

        } while (!userInput.equalsIgnoreCase("n"));
    }

}

