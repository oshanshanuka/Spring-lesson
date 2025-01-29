package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

   /* @Autowired(required = false)
    //public SpringBean(){}
    public SpringBean(@Value("oshan")String name,@Value("3") int id,@Value("true")boolean b){
        System.out.println("Spring Bean constructor");
        System.out.println(name);
        System.out.println(id);
        System.out.println(b);
    }

    @Autowired(required = false)
    public SpringBean(@Value("oshan")String name,@Value("3")int id){
        System.out.println("Spring Bean constructor");
        System.out.println(name);
        System.out.println(id);
    }*/

    @Value("oshan")
    private String name;

    public SpringBean(){
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println(name);
    }
   //meke mulinma enne null itpsse thmai oshan kyl enne.reason ek thmai lifecycle
}
