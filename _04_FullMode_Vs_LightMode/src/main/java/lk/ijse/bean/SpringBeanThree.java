package lk.ijse.bean;

import org.springframework.beans.factory.BeanNameAware;

public class SpringBeanThree implements BeanNameAware {
    public void setBeanName(String name) {
        //System.out.println("Spring Bean Three Name: "+name);
    }
}
