package sonnyboy.exercise.SpringBootExercise.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sonnyboy.exercise.SpringBootExercise.converter.CustomerOrderDtoConverter;
import sonnyboy.exercise.SpringBootExercise.dto.CustomerOrderDto;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.service.CustomerOrderService;

@RequestMapping("api/customerOrder")
@RestController
public class CustomerOrderController {
    private final CustomerOrderService customerOrderService;
    private final CustomerOrderDtoConverter customerOrderDtoConverter;
    Logger logger = LoggerFactory.getLogger(CustomerOrderController.class);

    @Autowired
    public CustomerOrderController(CustomerOrderService customerOrderService, CustomerOrderDtoConverter customerOrderDtoConverter){
        this.customerOrderService = customerOrderService;
        this.customerOrderDtoConverter = customerOrderDtoConverter;
    }

    @PostMapping
    public void addCustomerOrder(@RequestBody CustomerOrderDto customerOrderDto){
        final CustomerOrder customerOrder = customerOrderDtoConverter.convertCustomerOrderDtoToCustomerOrder(customerOrderDto);
        customerOrderService.addCustomerOrder(customerOrder);
    }
}
