package lk.ijse._13_spring_boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderDTO {
    @Id
    private int id;

    public OrderDTO(){}

    public OrderDTO(int id){
        this.id=id;
    }
}
