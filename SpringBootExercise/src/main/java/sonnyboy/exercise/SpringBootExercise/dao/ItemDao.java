package sonnyboy.exercise.SpringBootExercise.dao;

import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.List;

public interface ItemDao {
    Item addItem(Item item);
    Item deleteItem(Item item);
    Item getItem(Item item);
    List<Item> getItems();

    List<Item> getItemsForCustomerOrder(CustomerOrder customerOrder);
}
