package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Qualifier("girl1")
    @Autowired
    Agreement girl;

    public Boy(){
        System.out.println("Boy constrctor");
    }
    public void chatWithGirl(){
        Girl1 girl = new Girl1();
        girl.chat(); // me wdya tightcoupling.mew losse coupling krgnna ona

        Girl2 girl2 = new Girl2();
        girl2.chat();
    }
}
