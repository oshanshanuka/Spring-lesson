package lk.ijse.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringBean {
    public SpringBean(){
        //System.out.println("Spring Bean Object Created");
    }
}
