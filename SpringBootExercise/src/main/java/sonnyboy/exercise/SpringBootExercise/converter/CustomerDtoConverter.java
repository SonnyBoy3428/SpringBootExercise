package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerDto;
import sonnyboy.exercise.SpringBootExercise.model.Customer;

@Component
public class CustomerDtoConverter {
    public Customer convertCustomerDtoToCustomer(CustomerDto customerDto){
        Customer customer = new Customer();
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerAddress(customerDto.getCustomerAddress());
        customer.setCustomerZip(customerDto.getCustomerZip());
        customer.setCustomerDob(customerDto.getCustomerDob());

        return customer;
    }
}
