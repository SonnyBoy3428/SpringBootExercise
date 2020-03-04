package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDtoConverter {
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

    public List<CustomerDto> convertCustomersToCustomersDto(List<Customer> customers){
        List<CustomerDto> customersDto = new ArrayList<CustomerDto>();
        for(Customer customer : customers){
            CustomerDto customerDto = convertCustomerToCustomerDto(customer);
            customersDto.add(customerDto);
        }

        return customersDto;
    }
}
