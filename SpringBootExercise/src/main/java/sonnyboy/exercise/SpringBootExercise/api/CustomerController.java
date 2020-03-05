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
@RestController
@RequestMapping("/customer")
public class CustomerController {
    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;
    private final CustomerDtoConverter customerDtoConverter;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerDtoConverter customerDtoConverter){
        this.customerService = customerService;
        this.customerDtoConverter = customerDtoConverter;
    }

    @GetMapping
    public CustomerDto getCustomerById(@RequestParam long id) throws CustomerNotFoundException {
        logger.info("Received a GET request to get customer with ID " + id + ".");

        Customer foundCustomer = customerService.getCustomerById(id);

        return customerDtoConverter.convertCustomerToCustomerDto(foundCustomer);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByFirstName(@RequestParam String firstName) throws CustomerNotFoundException {
        logger.info("Received a GET request to get customers with first name " + firstName + ".");

        List<Customer> foundCustomers = customerService.getCustomersByFirstName(firstName);

        return customerDtoConverter.convertCustomersToCustomerDtos(foundCustomers);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByLastName(@RequestParam String lastName) throws CustomerNotFoundException {
        logger.info("Received a GET request to get customers with last name " + lastName + ".");

        List<Customer> foundCustomers = customerService.getCustomersByLastName(lastName);

        return customerDtoConverter.convertCustomersToCustomerDtos(foundCustomers);
    }

    @GetMapping
    public List<CustomerDto> getCustomersByFullName(@RequestParam String firstName, @RequestParam String lastName) throws CustomerNotFoundException {
        logger.info("Received a GET request to get customers with full name " + firstName + " " + lastName + ".");

        List<Customer> foundCustomers = customerService.getCustomersByFullName(firstName, lastName);

        return customerDtoConverter.convertCustomersToCustomerDtos(foundCustomers);
    }

    @GetMapping
    public CustomerDto getCustomerByUsername(@RequestParam String username) throws CustomerNotFoundException {
        logger.info("Received a GET request to get customer with username " + username + ".");

        Customer foundCustomer = customerService.getCustomerByUsername(username);

        return customerDtoConverter.convertCustomerToCustomerDto(foundCustomer);
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers() throws CustomerNotFoundException {
        logger.info("Received a GET request to get all customers.");

        List<Customer> foundCustomers = customerService.getAllCustomers();

        return customerDtoConverter.convertCustomersToCustomerDtos(foundCustomers);
    }

    @PostMapping
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        logger.info("Received a POST request to add a customer with the username " + customerDto.getUsername());

        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer addedCustomer = customerService.addCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(addedCustomer);
    }

    @DeleteMapping
    public CustomerDto deleteCustomer(@RequestParam long id) throws CustomerNotFoundException {
        logger.info("Received a DELETE request to delete a customer with the id " + id);

        Customer deletedCustomer = customerService.deleteCustomer(id);

        return customerDtoConverter.convertCustomerToCustomerDto(deletedCustomer);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) throws CustomerNotFoundException {
        logger.info("Received a PUT request to update a customer with the id " + customerDto.getId());

        Customer customer = customerDtoConverter.convertCustomerDtoToCustomer(customerDto);
        Customer updatedCustomer = customerService.updateCustomer(customer);

        return customerDtoConverter.convertCustomerToCustomerDto(updatedCustomer);
    }
}
