package com.sales.project.service;

import com.sales.project.entity.Item;
import java.util.List;

public interface ItemService {
    List<Item> retrieveItems();

    Item getItem(Long itemId);

    void createItem(Item item);

    void deleteItem(Long itemId);

    void updateItem(Item item);
}