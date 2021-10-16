package pjatk.way.sandwiches.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.types.Ingredients;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    @GetMapping("/example")
    public ResponseEntity<SandwichModel> getExampleSandwich(){
        Ingredients bread = new Ingredients(null, "white bread", 100, 1.5);
        SandwichModel poor = new SandwichModel(null, "poor", 100, 5.0d, List.of(bread), SandwichSize.KING_SIZE);

        return ResponseEntity.ok(poor);
    }

    @GetMapping("/null/sandwich")
    public ResponseEntity<SandwichModel> getNullSandwich()
    {
        Ingredients nullBread = new Ingredients(null, null, null, null);
        SandwichModel nullSandwich = new SandwichModel(null, "nullSandwich", 100, 5.0d, null, SandwichSize.KING_SIZE);

        return ResponseEntity.ok(nullSandwich);
    }
}
