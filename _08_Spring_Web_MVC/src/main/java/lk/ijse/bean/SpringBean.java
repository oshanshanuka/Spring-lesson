package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, ApplicationContextAware, BeanFactoryAware, InitializingBean, DisposableBean {
    public SpringBean(){
        System.out.println("Spring bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterProperties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SetApp");
    }
}
