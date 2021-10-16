package pjatk.way.sandwiches.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.types.Ingredients;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    public ResponseEntity<SandwichModel> getExampleSandwich(){
        Ingredients bread = new Ingredients(null, "white bread", 100, 1.5);
        SandwichModel poor = new SandwichModel(null, "poor", 100, 5.0d, List.of(bread), SandwichSize.KING_SIZE);

        return ResponseEntity.ok(poor);
    }
}
