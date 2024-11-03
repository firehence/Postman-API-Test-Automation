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

    public void deleteItem(Long id) {
        items.removeIf(item -> item.getId().equals(id));
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
