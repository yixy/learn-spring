package me.sweeat.dojo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan("me.sweeat.dojo")
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        TestBean testBean=  context.getBean(TestBean.class);

//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:mybeans.xml");
//        TestBean testBean=  context.getBean(TestBean.class);

        testBean.run();
        context.close();
        //((ClassPathXmlApplicationContext) context).close();
    }

}
