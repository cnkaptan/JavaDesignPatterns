package com.cnkaptan.DesignPatterns.CriteriaPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> local = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if (Objects.equals(ingredient.getLocal(), "Locally produced"))
            {
                local.add(ingredient);
            }
        }
        return local;
    }
}
