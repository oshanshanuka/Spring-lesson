package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DI_Interface{

    //@Autowired
    DI test1;

    public Test2(){
        System.out.println("Test2 constrctor");
    }

    /*public Test2(DI test1) {
        this.test1 = test1;
    }*/

    @Autowired
    public void setter(DI test1){
        this.test1 = test1;
    }

    public void display(){
        test1.sayHello();
    }

    @Override
    public void inject(DI test1) {
        this.test1 = test1;
    }

}
