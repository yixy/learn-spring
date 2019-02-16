package me.sweeat.dojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //从 classpath 获取配置文件，初始化ApplicationContext。等价于classpath*:mybeans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:mybeans.xml");
        //属性注入
        Cat cat=context.getBean("cat",Cat.class);
        //构造函数注入
        Dog dog=context.getBean("dog",Dog.class);
        //动态工厂注入
        Cat yellowCat=context.getBean("yellowcat",Cat.class);
        //静态工厂注入
        Cat blackCat=context.getBean("blackcat",Cat.class);

        System.out.println("cat color:"+cat.color);
        System.out.println("dog color:"+dog.color);
        System.out.println("dog yellowCat:"+yellowCat.color);
        System.out.println("dog blackCat:"+blackCat.color);
    }
}
