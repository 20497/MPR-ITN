package pjatk.way.sandwiches;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import pjatk.way.sandwiches.database.SandwichRepository;
import pjatk.way.sandwiches.enums.SandwichSize;
import pjatk.way.sandwiches.model.SandwichModel;
import pjatk.way.sandwiches.services.SandwichService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SandwichServiceTest {

    @Mock
    private SandwichRepository sandwichRepository;

    @InjectMocks
    private SandwichService sandwichService;

    @Test
    void changeNameMethodIsWorkingCorrectly() {
        //GIVEN
        SandwichModel sandwichModel = new SandwichModel(null, "name", 100, 20.0, null, SandwichSize.MEDIUM);
        //WHEN
        sandwichService.changeName(sandwichModel);
        //THEN
        assertThat(sandwichModel.getName()).isEqualTo("nameabc");
    }

    @Test
    void shouldFindById(){
        //GIVEN
        int id = 1;
        when(sandwichRepository.findById(any()))
                .thenReturn(Optional.of(new SandwichModel()));
        //WHEN
        SandwichModel byId = sandwichService.findById(id);
        //THEN
        assertThat(byId).isNotNull();
    }
}
