package sonnyboy.exercise.SpringBootExercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sonnyboy.exercise.SpringBootExercise.dao.ItemDao;
import sonnyboy.exercise.SpringBootExercise.model.Item;

@Service
public class ItemService {
    private final ItemDao itemDao;

    @Autowired
    public ItemService(@Qualifier("fakeItem") ItemDao itemDao){
        this.itemDao = itemDao;
    }

    public boolean addCustomer(Item item){
        return this.itemDao.addItem(item);
    }
}
