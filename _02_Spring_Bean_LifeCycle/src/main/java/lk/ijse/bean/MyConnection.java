package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection /*1)implements DisposableBean*/ implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroying Bean");
    }
    public MyConnection() {
        System.out.println("MyConnection Object Created");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My Connection Application Context set");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("My Connection Bean Name set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My Connection Bean Factory set");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My Connection Initializing Bean");
    }



    //cotext eka pawathin kan bean eka have

    //bean eka ayin karanna mohothakata kalin close wennae
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("MyConnection () Object Destroyed");
//    }
}