package me.sweeat.dojo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("me.sweeat.dojo")
public class App {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(App.class);
        TestBean testBean=context.getBean(TestBean.class);
        Time t=testBean.getObject();
        Thread.currentThread().sleep(1000);
        Time a=context.getBean("testBean",Time.class);
        Thread.currentThread().sleep(1000);
        Time b=context.getBean("testBean",Time.class);
        System.out.println(t.msec);
        System.out.println(a.msec);
        System.out.println(b.msec);
    }
}
