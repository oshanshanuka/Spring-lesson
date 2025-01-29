package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TextController {
    //Mapping method/handler method
    @GetMapping
    public String Test(){
        return "Test";
    }
}
