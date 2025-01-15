package lk.ijse.config;


import lk.ijse.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    @Bean("connection")
    MyConnection myConnection(){
        return new MyConnection();
    }
}
