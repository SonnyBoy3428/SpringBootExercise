package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

@RequestMapping("api/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;
    private final CustomerDtoConverter customerDtoConverter;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    public CustomerController(@Qualifier("fakeCustomerServiceImplementation") CustomerService customerService, CustomerDtoConverter customerDtoConverter){
        this.customerService = customerService;
        this.customerDtoConverter = customerDtoConverter;
    }

    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);

        CustomerDto addedCustomerDto = customerService.addCustomer(customer);


    }
}
