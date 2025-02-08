package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping
    public String test1(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.getFirstName();
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2() {
        return new CustomerDTO("oshan", "shanuka", 22);
    }
    //http://localhost:8080/_09_Rest_Controller_Web_exploded/json

    @GetMapping(path = "data",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> test3(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("oshan", "shanuka", 22));
        customerDTOS.add(new CustomerDTO("shan", "bhanuka", 22));
        return customerDTOS;
    }
    //http://localhost:8080/_09_Rest_Controller_Web_exploded/json/data
}
