package lk.ijse._16_spring_boot_loggins.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo")
public class DemoController {
    //******logging types******
    //Trace, Debug, Info, Warn, Error
    private  static final Logger log =
            LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/log-demo")
    public String logdemo(){
        log.trace(" This is a trace");
        log.debug("This is a debug");
        log.info(" This is ainfo");
        log.warn(" This is awarn");
        log.error("This is aerror");

        return "Hello World";
    }
}