package pjatk.way.sandwiches.model;

import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.types.Ingredients;
import pjatk.way.sandwiches.types.Sizes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Sandwich")
public class SandwichModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer baseCalories;
    private Double basePrice;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ingredients> ingredients;
    private SandwichSize sandwichSize;

    public SandwichModel() {
    }
    public SandwichModel(Integer id, String name, Integer baseCalories, Double basePrice, List<Ingredients> ingredients, SandwichSize sandwichSize) {
        this.id = id;
        this.name = name;
        this.baseCalories = baseCalories;
        this.basePrice = basePrice;
        this.ingredients = ingredients;
        this.sandwichSize = sandwichSize;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBaseCalories() {
        return baseCalories;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCalories(Integer baseCalories) {
        this.baseCalories = baseCalories;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSandwichSize(SandwichSize sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    @Override
    public String toString() {
        return "SandwichModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseCalories=" + baseCalories +
                ", basePrice=" + basePrice +
                ", ingredients=" + ingredients +
                ", sandwichSize=" + sandwichSize +
                '}';
    }
}
