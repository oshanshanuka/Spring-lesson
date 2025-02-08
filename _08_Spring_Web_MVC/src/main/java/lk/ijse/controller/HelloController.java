package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello");
    }
    @GetMapping
    public String hello(){
        return "index";
    }
}
