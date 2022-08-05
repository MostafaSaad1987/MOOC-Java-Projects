import java.util.ArrayList;

public class Recipe {
    String name;
    int timeToCook;
    ArrayList<String> recipes;

    public Recipe() {
        name = "";
        timeToCook = 0;
        recipes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(int timeToCook) {
        this.timeToCook = timeToCook;
    }

    public ArrayList<String> getRecipes() {
        return recipes;
    }

    public void addRecipes(String recipe) {
        recipes.add(recipe);
    }
}
