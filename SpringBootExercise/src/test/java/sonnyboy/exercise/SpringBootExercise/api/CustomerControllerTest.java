package sonnyboy.exercise.SpringBootExercise.api;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerDtoConverter;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

@WebMvcTest(CustomerController.class)
@AutoConfigureMockMvc
public class CustomerControllerTest {
    @MockBean
    CustomerService customerService;

    @MockBean
    CustomerDtoConverter customerDtoConverter;


}
