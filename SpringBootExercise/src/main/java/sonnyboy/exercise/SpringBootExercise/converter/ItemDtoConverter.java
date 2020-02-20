package sonnyboy.exercise.SpringBootExercise.converter;

import org.springframework.stereotype.Component;
import sonnyboy.exercise.SpringBootExercise.dto.ItemDto;
import sonnyboy.exercise.SpringBootExercise.model.Item;

@Component
public class ItemDtoConverter {
    public Item convertItemDtoToItem(ItemDto itemDto){
        Item item = new Item();
        item.setItemPrice(itemDto.getItemPrice());
        item.setItemName(itemDto.getItemName());

        return item;
    }
}
