package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        /*SpringBean bean1 = context.getBean(SpringBean.class);
        SpringBean bean2 = context.getBean(SpringBean.class);

        System.out.println(bean1);
        System.out.println(bean2);*/

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println("--------------------------");

        MyConnection myConnection2 = context.getBean(MyConnection.class);

        //MyConnection myConnection = context.getBean(MyConnection.class);
        context.registerShutdownHook();
    }
}