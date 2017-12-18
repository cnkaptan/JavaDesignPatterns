package com.cnkaptan.DesignPatterns.CriteriaPattern;

import java.util.List;

public interface Filter {
    List<Ingredient> meetCriteria(List<Ingredient> ingredients);
}
