package sonnyboy.exercise.SpringBootExercise.dao.fakeDao;

import org.springframework.stereotype.Repository;
import sonnyboy.exercise.SpringBootExercise.dao.ItemDao;
import sonnyboy.exercise.SpringBootExercise.model.Item;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeItem")
public class FakeItemDataAccessService implements ItemDao {
    List<Item> dB = new ArrayList<Item>();

    @Override
    public boolean addItem(Item item) {
        dB.add(item);
        return true;
    }
}
