package me.sweeat.dojo;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        //硬编码-前置增强////////////////
        Target t=new Target();
        BeforeAdvice advice=new Before();

        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(t);
        proxyFactory.addAdvice(advice);

        Target proxy=(Target)proxyFactory.getProxy();
        proxy.doSomething("硬编码");

        //Spring配置/////////////////////
        //从 classpath 获取配置文件，初始化ApplicationContext。等价于classpath*:mybeans.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:mybeans.xml");
        //前置增强
        Target target = (Target) context.getBean("mytarget");
        target.doSomething("spring xml doSomething");
        try{
            target.doSomethingEx("spring xml doSomethingEx");
        }catch (Exception e){

        }
        FlagInt targetFlag=(FlagInt)target;
        targetFlag.setFlag("enable");
        target.doSomething("spring xml doSomething with flag.");
    }
}
