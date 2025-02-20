package lk.ijse._13_spring_boot.advisor;

import lk.ijse._13_spring_boot.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtil exceptionHandler(Exception ex){
        return new ResponseUtil(500,"ex.getMessage()",null);
    }
}
