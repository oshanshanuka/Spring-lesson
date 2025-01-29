package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBeanOne;
import lk.ijse.bean.SpringBeanThree;
import lk.ijse.bean.SpringBeanTwo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    /*1.@Bean
    public SpringBeanOne getSpringBeanOne(){
    //Inter bean dependency
        SpringBeanTwo springBeanTwo1 = getSpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = getSpringBeanTwo();
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }*/

   /* @Bean
    public SpringBeanTwo springBeanTwo(){
        SpringBeanThree springBeanThree1 = springBeanThree();
        SpringBeanThree springBeanThree2 = springBeanThree();
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree springBeanThree() {
        return new SpringBeanThree();
    }*/
}
