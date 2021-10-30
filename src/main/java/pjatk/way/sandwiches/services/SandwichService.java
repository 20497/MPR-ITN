package pjatk.way.sandwiches.services;

import org.springframework.stereotype.Service;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.types.Ingredients;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichService {


    public SandwichModel PoorSandwichMethod() {
        List<Ingredients> ingredients = new ArrayList<>();
        Ingredients bread = new Ingredients(100, "white bread", 100, 1.5);
        ingredients.add(bread);
        return new SandwichModel(null, "poor", 100, 5.0d, ingredients, SandwichSize.KING_SIZE);
    }

    public SandwichModel RealManSandwichMethod() {
        List<Ingredients> ingredients = new ArrayList<>();
        Ingredients bread = new Ingredients(null, "EXTRA CHOLESTEROL BREAD", 100, 1.5);
        Ingredients meat = new Ingredients( null, "BEEF", 300, 4.0);
        ingredients.add(bread);
        ingredients.add(meat);
        return new SandwichModel(100, "Real MAN", 1000, 10.0d, ingredients, SandwichSize.KING_SIZE);
    }
}
