package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

@RequestMapping("api/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;
    private final CustomerDtoConverter customerDtoConverter;
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    public CustomerController(CustomerService customerService, CustomerDtoConverter customerDtoConverter){
        this.customerService = customerService;
        this.customerDtoConverter = customerDtoConverter;
    }

    @PostMapping
    public void addCustomer(@RequestBody CustomerDto customerDto){
        final Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        customerService.addCustomer(customer);
    }
}
