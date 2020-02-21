package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.exception.ItemNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.List;

public interface ItemDao {
    Item addItem(Item item) throws ItemNotFoundException;
    Item deleteItem(Item item) throws ItemNotFoundException;
    Item getItem(Item item) throws ItemNotFoundException;
    List<Item> getItems();

    List<Item> getItemsForCustomerOrder(CustomerOrder customerOrder) throws ItemNotFoundException;
}
