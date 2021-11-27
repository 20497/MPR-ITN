package pjatk.way.sandwiches;

import org.junit.jupiter.api.Test;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.services.SandwichService;
import static org.assertj.core.api.Assertions.assertThat;

public class SandwichServiceTest {

    private SandwichService sandwichService = new SandwichService(null);

    @Test
    void changeNameMethodIsWorkingCorrectly() {
        //GIVEN
        SandwichModel sandwichModel = new SandwichModel(null, "name", 100, 20.0, null, SandwichSize.MEDIUM);
        //WHEN
        sandwichService.changeName(sandwichModel);
        //THEN
        assertThat(sandwichModel.getName()).isEqualTo("nameabc");
    }
}
