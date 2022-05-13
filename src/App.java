import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");
        
        while (true) {
            System.out.println("Please enter a name:");
            String inputName = scanner.nextLine();
            boolean isDoggo;

            if(inputName.equals("")) {
                break;
            } else {
                System.out.println("Is it a dog?  Yes or no?");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    isDoggo = true;
                } else {
                    isDoggo = false;
                }
            }
        Animal newInput = new Animal(inputName, isDoggo);
        animal.add(newInput);
        }
        for (Animal doggo: animal) {
            System.out.println(animal);
        }
    }
}
