
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        File recipes = new File(fileName);

        Scanner fileScan;

        try {
            fileScan = new Scanner(recipes);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        ArrayList<Recipe> myRecipes = CreateRecipes(recipes);

        System.out.println("\nCommands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");

        String userInput = "";
        System.out.print("Enter command: ");
        userInput = scanner.nextLine();

        while (true) {
            if (userInput.equals("list")) {
                System.out.println("\nRecipes:");

                for (Recipe myRecipe : myRecipes) {
                    System.out.println(myRecipe.getName() + ", cooking time: " + myRecipe.getTimeToCook());
                }

                System.out.println();
                System.out.print("Enter command: ");
                userInput = scanner.nextLine();

            } else if (userInput.contains("name")) {
                System.out.print("Searched word: ");
                String foodEntered = scanner.nextLine();

                System.out.println("\nRecipes:");
                for (Recipe myRecipe : myRecipes) {
                    if (myRecipe.getName().contains(foodEntered)) {
                        System.out.println(myRecipe.getName() + ", cooking time: " + myRecipe.getTimeToCook());
                    }
                }

                System.out.println();
                System.out.print("Enter command: ");
                userInput = scanner.nextLine();
            } else if (userInput.contains("time")) {
                System.out.print("Max cooking time: ");
                int timeEntered = Integer.parseInt(scanner.nextLine());

                System.out.println("\nRecipes:");
                for (Recipe myRecipe : myRecipes) {
                    if (myRecipe.getTimeToCook() <= timeEntered) {
                        System.out.println(myRecipe.getName() + ", cooking time: " + myRecipe.getTimeToCook());
                    }
                }

                System.out.println();
                System.out.print("Enter command: ");
                userInput = scanner.nextLine();
            } else if (userInput.contains("ingredient")) {
                System.out.print("Ingredient: ");
                String enteredIngredient = scanner.nextLine();

                System.out.println("\nRecipes:");
                for (Recipe myRecipe : myRecipes) {
                    if (myRecipe.getRecipes().contains(enteredIngredient)) {
                        for(int i = 0; i < myRecipe.getRecipes().size(); i++){
                            if(myRecipe.getRecipes().get(i).equals(enteredIngredient)) {
                                System.out.println(myRecipe.getName() + ", cooking time: " + myRecipe.getTimeToCook());
                            }
                        }
                    }
                }

                System.out.println();
                System.out.print("Enter command: ");
                userInput = scanner.nextLine();
            } else if (userInput.equals("stop")) {
                break;
            } else {
                System.out.println("Wrong input.");
                userInput = scanner.nextLine();
            }
        }
    }


    public static ArrayList CreateRecipes(File file) {
        boolean stillAdding = false;
        Recipe recipe = new Recipe();

        Scanner fileScan;

        try {
            fileScan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return new ArrayList<>();
        }

        ArrayList<Recipe> myRecipes = new ArrayList<>();

        while (fileScan.hasNextLine()) {
            final String line = fileScan.nextLine();

            String[] words = line.split("\\r\\n");

            for (int i = 0; i < words.length; i++) {
                if (words[i].isEmpty()) {
                    continue;
                } else if (Character.isUpperCase(words[i].charAt(0))) {
                    myRecipes.add(recipe = new Recipe());
                    recipe.setName(words[i]);
                    recipe.setTimeToCook(Integer.parseInt(fileScan.nextLine()));
                    stillAdding = true;
                } else if (stillAdding) {
                    if (Character.isUpperCase(words[i].charAt(0))) {
                        stillAdding = false;
                    } else {
                        recipe.addRecipes(words[i]);
                    }
                }
            }
        }
        return myRecipes;
    }
}