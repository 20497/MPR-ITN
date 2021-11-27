package pjatk.way.sandwiches.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import pjatk.way.sandwiches.database.SandwichRepository;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.types.Ingredients;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SandwichService {

    private final SandwichRepository sandwichRepository;

    public SandwichService(SandwichRepository sandwichRepository){
        this.sandwichRepository = sandwichRepository;
    }

    public SandwichModel PoorSandwichMethod() {
        List<Ingredients> ingredients = new ArrayList<>();
        Ingredients bread = new Ingredients(100, "white bread", 100, 1.5);
        ingredients.add(bread);
        return new SandwichModel(null, "poor", 100, 5.0d, ingredients, SandwichSize.KING_SIZE);
    }

    public SandwichModel RealManSandwichMethod() {
        Ingredients bread = new Ingredients(null, "EXTRA CHOLESTEROL BREAD", 100, 1.5);
        Ingredients meat = new Ingredients( null, "BEEF", 300, 4.0);
        SandwichModel sandwich = new SandwichModel(null, "Real MAN", 1000, 10.0d, List.of(meat, bread), SandwichSize.KING_SIZE);
        return sandwichRepository.save(sandwich);
    }

    public SandwichModel findById(Integer id){
        Optional<SandwichModel> byId = sandwichRepository.findById(id);
        return byId.orElseThrow(RuntimeException::new);
    }

    public void addIngredient(SandwichModel sandwichModel, Ingredients ingredients){
        if(sandwichModel.getIngredients() != null){
            sandwichModel.getIngredients().add(ingredients);
        }
    }

    public void changeName(SandwichModel sandwichModel){
        if(sandwichModel.getName() != null) {
            sandwichModel.setName(sandwichModel.getName() + "abc");
        }
    }

    public void changeSandwichSize(SandwichModel sandwichModel, SandwichSize sandwichSize){
        if(sandwichModel.getSandwichSize() != null){
            sandwichModel.setSandwichSize(sandwichSize.SMALL);
        }
    }

    public void changeBaseCalories(SandwichModel sandwichModel){
        if(sandwichModel.getBaseCalories() != null){
            sandwichModel.setBaseCalories(100);
        }
    }

    public void changeBasePrice(SandwichModel sandwichModel){
        if(sandwichModel.getBasePrice() != null){
            sandwichModel.setBasePrice(20d);
        }
    }

    public void changeId(SandwichModel sandwichModel){
        if(sandwichModel.getId() != null){
            sandwichModel.setId(997);
        }
    }
}
