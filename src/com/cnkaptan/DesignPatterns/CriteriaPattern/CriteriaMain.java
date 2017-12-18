package com.cnkaptan.DesignPatterns.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMain {
    public static void main(String[] args) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Cheddar", "Locally produced", true));
        ingredients.add(new Ingredient("Ham", "Cheshire", false));
        ingredients.add(new Ingredient("Tomato", "Kent", true));
        ingredients.add(new Ingredient("Turkey", "Locally produced", false));

        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter vegetarian = new VegetarianFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);

        printIngredients(local.meetCriteria(ingredients),
                "LOCAL:\n");
        printIngredients(nonLocal.meetCriteria(ingredients),
                "\nNOT LOCAL:\n");
        printIngredients(vegetarian.meetCriteria(ingredients),
                "\nVEGETARIAN:\n");
        printIngredients(localAndVegetarian.meetCriteria(ingredients),
                "\nLOCAL VEGETARIAN:\n");
        printIngredients(localOrVegetarian.meetCriteria(ingredients),
                "\nENVIRONMENTALLY FRIENDLY:\n");
    }


    public static void printIngredients(List<Ingredient> ingredients, String header) {
        StringBuilder sb = new StringBuilder();
        sb.append(header);
        for (Ingredient ingredient : ingredients) {
            sb.append(ingredient.getName()).append(" ").append(ingredient.getLocal()).append("\n");
        }

        System.out.println(sb.toString());
    }
}
