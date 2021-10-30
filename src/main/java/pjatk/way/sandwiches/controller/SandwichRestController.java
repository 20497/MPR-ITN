package pjatk.way.sandwiches.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.services.SandwichService;
import pjatk.way.sandwiches.types.Ingredients;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {
    private final SandwichService sandwichService;

    public SandwichRestController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }

    @GetMapping("/example")
    public ResponseEntity<SandwichModel> getExampleSandwich(){
        return ResponseEntity.ok(sandwichService.PoorSandwichMethod());
    }

    @GetMapping("/null/sandwich")
    public ResponseEntity<SandwichModel> getNullSandwich()
    {
        Ingredients nullBread = new Ingredients(null, null, null, null);
        SandwichModel nullSandwich = new SandwichModel(null, "nullSandwich", 100, 5.0d, null, SandwichSize.KING_SIZE);

        return ResponseEntity.ok(nullSandwich);
    }

    @GetMapping("/BOSS")
    public ResponseEntity<SandwichModel> getBossSandwich()
    {
        return ResponseEntity.ok(sandwichService.RealManSandwichMethod());
    }
}
