package lk.ijse;

import lk.ijse.bean.SpringBeanOne;
import lk.ijse.bean.SpringBeanTwo;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

        /*1. SpringBeanOne beanOne = context.getBean(SpringBeanOne.class);
        System.out.println(beanOne);

        SpringBeanOne beanTwo = context.getBean(SpringBeanOne.class);
        System.out.println(beanTwo);


        SpringBeanTwo bean3 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean3);


        SpringBeanTwo bean4 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean4);*/

        /*SpringBeanTwo beanTwo1 = context.getBean(SpringBeanTwo.class);
        System.out.println(beanTwo1);

        SpringBeanTwo beanTwo2 = context.getBean(SpringBeanTwo.class);
        System.out.println(beanTwo2);*/
    }
}