package com.sales.project.service.impl;

import java.util.List;
import java.util.Optional;

import com.sales.project.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sales.project.repository.ItemRepository;
import com.sales.project.entity.Item;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> retrieveItems(){
        List<Item> items = itemRepository.findAll();
        return items;
    }

    public Item getItem(Long itemId){
        Optional<Item> optItm = itemRepository.findById(itemId);
        return optItm.get();
    }

    public void createItem(Item item){
        itemRepository.save(item);
    }

    public void deleteItem(Long itemId){
        itemRepository.deleteById(itemId);
    }

    public void updateItem(Item item){
        itemRepository.save(item);
    }

}
