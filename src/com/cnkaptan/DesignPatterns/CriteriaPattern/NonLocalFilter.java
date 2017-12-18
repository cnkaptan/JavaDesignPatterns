package com.cnkaptan.DesignPatterns.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class NonLocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> nonLocal = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if (!ingredient.getLocal().equals("Locally produced")) {
                nonLocal.add(ingredient);
            }
        }
        return nonLocal;
    }
}
