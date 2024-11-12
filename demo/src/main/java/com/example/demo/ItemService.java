package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> items = new ArrayList<>();

    public List<Item> getAllItems() {
        return items;
    }

    public Item createItem(Item item) {
        items.add(item);
        return item;
    }


    public boolean deleteItem(Long id) {

        for (Item item : items) {
            if (item.getId().equals(id)) {

                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public Item updateItem(Long id, Item updatedItem) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                item.setName(updatedItem.getName());
                return item;
            }
        }
        return null;
    }
}
