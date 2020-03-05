package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter class for the conversion operations between Customer objects and CustomerDto objects.
 */
@Component
public class CustomerDtoConverter {
    /**
     * Converts a CustomerDto object into a Customer object.
     * @param customerDto The CustomerDto object to be converted.
     * @return The Customer object.
     */
    public Customer convertCustomerDtoToCustomer(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setZipCode(customerDto.getZipCode());
        customer.setAddress(customerDto.getAddress());
        customer.setDateOfBirth(customerDto.getDateOfBirth());
        customer.setUsername(customerDto.getUsername());
        customer.setPassword(customerDto.getPassword());
        customer.setIsPrimeCustomer(customerDto.getIsPrimeCustomer());

        return customer;
    }

    /**
     * Converts a Customer object into a CustomerDto object.
     * @param customer The Customer object to be converted.
     * @return The CustomerDto object.
     */
    public CustomerDto convertCustomerToCustomerDto(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setZipCode(customer.getZipCode());
        customerDto.setAddress(customer.getAddress());
        customerDto.setDateOfBirth(customer.getDateOfBirth());
        customerDto.setUsername(customer.getUsername());
        customerDto.setPassword(customer.getPassword());
        customerDto.setIsPrimeCustomer(customer.getIsPrimeCustomer());

        return customerDto;
    }

    /**
     * Converts a list of Customer objects into a list of CustomerDto objects.
     * @param customers The list of Customer objects to be converted.
     * @return The list of CustomerDto objects.
     */
    public List<CustomerDto> convertCustomersToCustomerDtos(List<Customer> customers){
        List<CustomerDto> customerDtos = new ArrayList<CustomerDto>();
        for(Customer customer : customers){
            CustomerDto customerDto = convertCustomerToCustomerDto(customer);
            customerDtos.add(customerDto);
        }

        return customerDtos;
    }
}
