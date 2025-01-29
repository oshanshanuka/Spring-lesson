package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = "lk.ijse.bean")
@Import({AppConfig1.class,AppConfig2.class})
//@ImportResource("classpath:hibernate.xml")
//@ImportResource("file:absolute-path-of-hibernate.xml")
public class AppConfig {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
