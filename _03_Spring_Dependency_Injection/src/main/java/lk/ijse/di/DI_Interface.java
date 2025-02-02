package lk.ijse.di;


import org.springframework.beans.factory.annotation.Autowired;

public interface DI_Interface {
    void inject(Test1 test1);

    @Autowired
    void inject(DI test1);
}
