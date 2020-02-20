package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerOrderDto;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;

@Component
public class CustomerOrderDtoConverter {
    public CustomerOrder convertCustomerOrderDtoToCustomerOrder(CustomerOrderDto customerOrderDto){
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomerOrderCost(customerOrderDto.getCustomerOrderCost());
        customerOrder.setCustomerOrderDate(customerOrderDto.getCustomerOrderDate());

        return customerOrder;
    }
}
