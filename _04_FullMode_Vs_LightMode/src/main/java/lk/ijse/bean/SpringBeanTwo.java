package lk.ijse.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

public class SpringBeanTwo implements BeanNameAware {
    /*public SpringBeanTwo(){
       System.out.println("Spring Bean two Object Created");
    }*/

    @Override
    public void setBeanName(String name) {
        //System.out.println("Spring Bean Two Bean Name Set");
    }
}
