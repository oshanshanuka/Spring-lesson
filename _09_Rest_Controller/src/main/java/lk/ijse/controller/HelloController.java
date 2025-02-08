package lk.ijse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    public HelloController(){
        System.out.println("Hello");
    }
    @GetMapping
    public String hello(){
        return "hello world";
    }

    @PostMapping
    public String Post(){
        return "Post Mapping";
    }

    @PutMapping
    public String put(){
        return "put Mapping";
    }

    @DeleteMapping
    public String delete(){
        return "Delete Mapping";
    }

    @PatchMapping
    public String patch(){
        return "Patch mapping";
    }
}
