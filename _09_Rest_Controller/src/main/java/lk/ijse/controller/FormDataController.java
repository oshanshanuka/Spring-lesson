package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {
    /*@PostMapping
    public String test1(@RequestParam(value = "id") String id,
                        @RequestParam(value = "name") String name){
        return id+"::"+name;
    }*/
    //url->http://localhost:8080/_09_Rest_Controller_Web_exploded/form?id=1234&name=oshan

    @PostMapping
    public String test1(@ModelAttribute CustomerDTO customerDTO){
        System.out.println(customerDTO.getFirstName());
        return customerDTO.toString();
    }
}
