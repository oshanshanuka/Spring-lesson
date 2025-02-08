package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WIldCardMappingController {
    @GetMapping(path = "test/*/hello")
    public String test(){
        return "Get Mapping";
    }

    @GetMapping(path = "test/*/*")
    public String test2(){
        return "Get Mapping";
    }
}
