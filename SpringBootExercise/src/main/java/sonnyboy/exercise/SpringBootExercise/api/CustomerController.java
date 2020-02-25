package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

/**
 * REST Api for the customer endpoints.
 */
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

    @PostMapping
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer addedCustomer = customerService.addCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(addedCustomer);
    }

    @PostMapping
    public CustomerDto deleteCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer deletedCustomer = customerService.deleteCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(deletedCustomer);
    }

    @PostMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer foundCustomer = customerService.getCustomerById(customerDto.getId());
        customerService.deleteCustomer(foundCustomer);

        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer updatedCustomer = customerService.addCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(deletedCustomer);
    }

    @GetMapping
    public CustomerDto getCustomerById(@RequestParam long id) throws CustomerNotFoundException {
        Customer foundCustomer = customerService.getCustomerById(id);

        return customerDtoConverter.convertCustomerToCustomerDto(foundCustomer);
    }
}
