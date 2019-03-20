package me.sweeat.dojo;

import me.sweeat.dojo.service.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestBean {

    @Autowired
    @Qualifier(value = "a")
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean myBean;

    public void run()
    {
        System.out.println(myBean.getID());
        System.out.println(myBean.getName());
        System.out.println( "Hello World!" );
        return;
    }
}
