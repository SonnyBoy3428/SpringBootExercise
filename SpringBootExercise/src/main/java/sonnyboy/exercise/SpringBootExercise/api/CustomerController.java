package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.exception.CustomerNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.Customer;
import sonnyboy.exercise.SpringBootExercise.service.CustomerService;

import java.util.List;

/**
 * REST Api for the customer endpoints.
 */
@RequestMapping("/customer")
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
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer addedCustomer = customerService.addCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(addedCustomer);
    }

    @DeleteMapping
    public CustomerDto deleteCustomer(@RequestParam long id) throws CustomerNotFoundException {
        Customer deletedCustomer = customerService.deleteCustomer(id);

        return customerDtoConverter.convertCustomerToCustomerDto(deletedCustomer);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer updatedCustomer = customerService.updateCustomer(customer);;

        return customerDtoConverter.convertCustomerToCustomerDto(updatedCustomer);
    }

    @GetMapping
    public CustomerDto getCustomerById(@RequestParam long id) throws CustomerNotFoundException {
        Customer foundCustomer = customerService.getCustomerById(id);

        return customerDtoConverter.convertCustomerToCustomerDto(foundCustomer);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByFirstName(@RequestParam String firstName) throws CustomerNotFoundException {
        List<Customer> foundCustomers = customerService.getCustomersByFirstName(firstName);

        return customerDtoConverter.convertCustomersToCustomersDto(foundCustomers);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByLastName(@RequestParam String lastName) throws CustomerNotFoundException {
        List<Customer> foundCustomers = customerService.getCustomersByLastName(lastName);

        return customerDtoConverter.convertCustomersToCustomersDto(foundCustomers);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByUsername(@RequestParam String username) throws CustomerNotFoundException {
        List<Customer> foundCustomers = customerService.getCustomersByUsername(username);

        return customerDtoConverter.convertCustomersToCustomersDto(foundCustomers);
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers() throws CustomerNotFoundException {
        List<Customer> foundCustomers = customerService.getAllCustomers();

        return customerDtoConverter.convertCustomersToCustomersDto(foundCustomers);
    }
}
