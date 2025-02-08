package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "params")
public class ParamsController {
    @GetMapping(params = {"id","name"})
    public String test1(@RequestParam(value = "id") String id,
                        @RequestParam(value = "name") String name){
        return id+"::"+name;
    }
    //url ek dnne mehema
    //http://localhost:8080/_09_Rest_Controller_Web_exploded/params?id=1&name=oshan
}
