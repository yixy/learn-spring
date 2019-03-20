package me.sweeat.dojo;

import me.sweeat.dojo.service.TestBean;
import me.sweeat.dojo.service.TestBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean=context.getBean("testBean",TestBean.class);
        testBean.echo();
        TestBean2 testBean2=context.getBean("testBean2",TestBean2.class);
        testBean2.echo();
        System.out.println( "Hello World!" );
    }
}
