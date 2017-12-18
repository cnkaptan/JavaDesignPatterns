package com.cnkaptan.DesignPatterns.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class VegetarianFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> vegetarian = new ArrayList<>();

        for (Ingredient ingredient : ingredients) {
            if (ingredient.isVegetarian()){
                vegetarian.add(ingredient);
            }
        }
        return vegetarian;
    }
}
