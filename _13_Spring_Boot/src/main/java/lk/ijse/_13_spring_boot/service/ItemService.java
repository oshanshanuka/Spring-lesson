package lk.ijse._13_spring_boot.service;

import lk.ijse._13_spring_boot.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    void addItem(ItemDTO itemDTO);
    void deleteItem(int id);
    void updateItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();
}