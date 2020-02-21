package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.ItemDao;
import sonnyboy.exercise.SpringBootExercise.exception.ItemNotFoundException;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrder;
import sonnyboy.exercise.SpringBootExercise.model.CustomerOrderItem;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeItem")
public class FakeItemDataAccessService implements ItemDao {
    List<Item> itemDb = new ArrayList<Item>();

    @Override
    public Item addItem(Item item) throws ItemNotFoundException{
        if(item.equals(null)){
            throw new ItemNotFoundException("Cannot add an empty item.");
        }

        itemDb.add(item);

        return item;
    }

    @Override
    public Item deleteItem(Item item) throws ItemNotFoundException{
        if(item.equals(null)){
            throw new ItemNotFoundException("Cannot delete an empty item.");
        }

        itemDb.remove(item);

        return item;
    }

    @Override
    public Item getItem(Item item) throws ItemNotFoundException{
        Item foundItem = null;

        for(Item itemItem : itemDb){
            if(itemItem.getItemId() == item.getItemId()){
                foundItem = itemItem;
                break;
            }
        }

        if(foundItem.equals(null)){
            throw new ItemNotFoundException("Item with ID " + item.getItemId() + " does not exist.");
        }

        return foundItem;
    }

    @Override
    public List<Item> getItems() {
        return itemDb;
    }

    @Override
    public List<Item> getItemsForCustomerOrder(CustomerOrder customerOrder) throws ItemNotFoundException{
        List<CustomerOrderItem> customerOrderItems = customerOrder.getCustomerOrderItems();
        List<Item> items = new ArrayList<Item>();

        for(CustomerOrderItem customerOrderItem : customerOrderItems){
            Item item = customerOrderItem.getItem();
            if(!item.equals(null)){
                items.add(item);
            }
        }

        if(items.equals(null) || items.isEmpty()){
            throw new ItemNotFoundException("Customer order with the ID " + customerOrder.getCustomerOrderId() + " does not have any items.");
        }

        return items;
    }
}
