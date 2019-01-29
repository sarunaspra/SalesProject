package com.sales.project.controller;

import com.sales.project.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sales.project.service.ItemService;

import java.util.List;

@RestController
public class ItemRestController {

    @Autowired
    ItemService itemService;

    @GetMapping("/api/items")
    public List<Item> getItems(){
        List<Item> items = itemService.retrieveItems();
        return items;
    }

    @GetMapping("/api/items/{itemId}")
    public Item getItem(@PathVariable(name = "itemId") Long itemId){
        return itemService.getItem(itemId);
    }

    @PostMapping("/api/items")
    public void createItem(Item item){
        itemService.createItem(item);
        System.out.println("Item created successfully");
    }

    @DeleteMapping("/api/items/{itemId}")
    public void deleteItem(@PathVariable(name = "itemId") Long itemId){
        itemService.deleteItem(itemId);
        System.out.println("Item deleted successfully");
    }

    @PutMapping("/api/items/{itemId}")
    public void updateItem(@RequestBody Item item,
                           @PathVariable(name = "itemId") Long itemId){
        Item itm = itemService.getItem(itemId);
        if( itm != null){
            itemService.updateItem(item);
        }
    }
}
