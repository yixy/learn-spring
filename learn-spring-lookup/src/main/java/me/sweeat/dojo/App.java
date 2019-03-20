package me.sweeat.dojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
        SingleBean singleBean = context.getBean("singleBean", SingleBean.class);
        PrototypeBean p1 = singleBean.getPrototypeBean();
        Thread.sleep(1000);
        PrototypeBean p2 = singleBean.getPrototypeBean();
        p1.echo();
        p2.echo();
    }
}
